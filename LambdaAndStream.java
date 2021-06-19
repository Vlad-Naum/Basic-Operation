import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStream {
    public static void main(String[] args) {
        int i1 =34; int i2 = 56;
        FunctionalInterf interf = (i) -> i1+i2;
        FunctionalInterf interf2 = (i) -> i1*i2;
        FunctionalInterf interf3 = LambdaAndStream::sum;
        System.out.println(interf.operation() + " " + interf2.operation() + " " + interf3.operation(i1, i2));

        List<Integer> list = getIntList().stream().sorted().collect(Collectors.toList()); //сортирует лист
        int max = list.stream().max(Integer::compareTo).get(); //находит максимальное значение в листе
        int y = list.stream().filter(i -> i ==21).findFirst().get(); //находит число 21 в листе
        int[] array = getStringList().
                stream().
                mapToInt(Integer::parseInt).toArray(); //преобразовывает List<String> в массив int[]



    }

    public static int sum(int... i){
        return Arrays.stream(i).sum();
    }

    public static List<Integer> getIntList(){
        List<Integer> list = Arrays.asList(3, 2, 7, 21, 99, 1);
        return list;
    }

    public static List<String> getStringList(){
        List<String> list = Arrays.asList("3445", "5452", "21");
        return list;
    }
}

interface FunctionalInterf{
    int operation(int... i);
}
