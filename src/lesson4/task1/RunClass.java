package lesson4.task1;

import java.util.*;

public class RunClass {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "mango", "apple", "coconut", "watermelon", "banana",
                "coconut", "watermelon", "avocado", "apple", "banana", "mango", "mango", "apple", "banana", "watermelon");
        System.out.println("Исходный список:");
        fruits.forEach(System.out::println);

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : fruits) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("\nБез повторов: ");
        HashSet<String> unique = new HashSet<>(fruits);
        unique.forEach(System.out::println);

    }

}
