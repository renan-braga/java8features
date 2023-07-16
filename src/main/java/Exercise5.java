import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("pt1");
        Predicate<Integer> gt5 = number -> number > 5;
        List<Integer> integers = Arrays.asList(1, 3, 6, 9, 12, 22);
        List<Integer> numberGt5 = integers.stream().filter(gt5).collect(Collectors.toList());
        numberGt5.forEach(System.out::println);

        System.out.println("\n\npt2");
        Function<String, Integer> sizeMapper = String::length;
        List<String> fruits = Arrays.asList("Banana", "Orange", "Mango", "Apple");
        List<Integer> sizes = fruits.stream().map(sizeMapper).collect(Collectors.toList());
        sizes.forEach(System.out::println);

        System.out.println("\n\npt3");
        Consumer<Integer> showNumbers = System.out::println;
        List<Integer> randomNumbers = Arrays.asList(23, 21, 99, 62, 11);
        randomNumbers.forEach(showNumbers);

    }
}
