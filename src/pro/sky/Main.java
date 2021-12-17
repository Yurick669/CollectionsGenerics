package pro.sky;

import java.util.*;

public class Main {

    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 10, 12, 13, 15, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8));
    private static List<String> words = new ArrayList(List.of("today", "today", "we", "will", "work", "with", "this", "text", "will", "work"));

    private static void task1() {
        Set<Integer> oddNumbers = new TreeSet<>(nums);
        for (Integer num : oddNumbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("- Нечётные числа без повторений и в порядке возрастания");
    }

    private static void task2() {
        Set<Integer> ListOfUnique = new TreeSet<>(nums);
        for (Integer num : ListOfUnique) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("- Четные числа без повторений и в порядке возрастания");
    }

    private static Set<String> task3() {
        Set<String> withoutDuplicates = new LinkedHashSet<>(words);
        System.out.println(withoutDuplicates + " - Текст без дублей");
        return withoutDuplicates;
    }

    private static Set<String> task4() {
        Set<String> numberOfDuplicates = new HashSet<>(words);
        System.out.println(words.size()- numberOfDuplicates.size());
        return numberOfDuplicates;
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();


    }
}



