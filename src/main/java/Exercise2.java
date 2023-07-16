import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Coffe", "soda", "Water", "wine", "Beer", "juice");
        list.stream().filter(item -> Character.isUpperCase(item.charAt(0))).forEach(System.out::println);
    }
}
