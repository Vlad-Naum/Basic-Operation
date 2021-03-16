import java.io.*;
import java.rmi.AccessException;
import java.util.TooManyListenersException;

public class Potok {
    static String str = "Java super!";
    static String str1 = "Hello world!";
    public static void potok(){
        int b;
        try (FileWriter fw = new FileWriter("C:\\Users\\Darkpro\\IdeaProjects\\1.txt")){
            fw.write(str1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileReader fr = new FileReader("C:\\Users\\Darkpro\\IdeaProjects\\1.txt")) {
            while (( b = fr.read()) != -1){
                System.out.print((char) b);}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void potokBuff(){
        int b=0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter f = new FileWriter("C:\\Users\\Darkpro\\IdeaProjects\\2.txt")){
            String st = reader.readLine();
            f.write(st);

        } catch (IOException e) {
            e.printStackTrace();
        }
            try(BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\Darkpro\\IdeaProjects\\2.txt")) ) {
                String t;
                while ((t = reader1.readLine()) != null) {
                    System.out.println(t);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
