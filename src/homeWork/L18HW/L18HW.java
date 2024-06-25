package homeWork.L18HW;

import java.util.*;

public class L18HW {
    public static void main(String[] args) {
        // task1();

        additionalTask();
    }

    public static void task1() {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6, 6, 6));

        Optional<Integer> result = intList.stream().distinct().filter(item -> item % 2 == 0).reduce(Integer::sum);

        result.ifPresent(res -> System.out.println(result.get()));
    }

    public static void additionalTask() {
        int[] allowedId = {1, 2, 5, 8, 9, 13};
        Map<Integer, String> userMap = new HashMap<>() {{
            put(1, "Vasya");
            put(2, "Petya");
            put(3, "Dimka");
            put(13, "Gleb");
            put(14, "Katya");
        }};

        Arrays.stream(allowedId)
                .filter(userMap::containsKey)
                .mapToObj(userMap::get)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .toList()
                .forEach(System.out::println);
    }
}
