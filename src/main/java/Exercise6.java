import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 9);
        IntStream intStream = numbers.parallelStream().mapToInt(num -> num * num);
        intStream.forEach(System.out::println);
    }
}
