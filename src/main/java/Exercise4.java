import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Guitar", "Harmonica", "Keyboard", "Violin");
        System.out.println(findString(list, "Piano"));
    }

    public static Optional<String> findString(List<String> list, String s){
        return list.stream().filter(item -> item.contains(s)).findAny();
    }


}
