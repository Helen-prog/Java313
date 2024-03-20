package lessons15.generics.sample_5;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));

        System.out.println("Исходный список чисел: " + numbers);
        ArrayList<Integer> reversedNumbers = reverseList(numbers);
        System.out.println("Перевернутый список: " + reversedNumbers);

        System.out.println("\nИсходный список цветов: " + colors);
        ArrayList<String> reversedWords = reverseList(colors);
        System.out.println("Перевернутый список: " + reversedWords);
    }

    public static <T> ArrayList<T> reverseList(ArrayList<T> originalList) {
        ArrayList<T> reversedList = new ArrayList<>();

        for(int i = originalList.size() - 1; i >= 0; i--){
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}
