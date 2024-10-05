import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Никита",
                "Андрей",
                "Виталий",
                "Анна"
        ));

        List<String> collected = names.stream()
                .map(name -> name.substring(1))
                .collect(Collectors.toList());

        System.out.println(collected);

    }
}