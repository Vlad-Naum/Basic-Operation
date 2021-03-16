import java.util.HashMap;
import java.util.Map;

public class MnogoPotoki {
    public static void Potoki(int n, String[] name){
        System.out.println(name[0]);
        for (int i = 1; i < n; i++) {
            MyThrd myt = MyThrd.createAndStart(name[i]);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(".");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name[0] + " konec");
    }
}
class MyThrd implements Runnable{
    Thread thrd;

    public MyThrd(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThrd createAndStart(String name){
        MyThrd mt = new MyThrd(name);
        mt.thrd.start();
        return mt;
    }

    public void run() {
        System.out.println(thrd.getName());
        for (int i = 0; i < 20; i++) {
            System.out.print(1);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thrd.getName() + " konec");
    }
}

