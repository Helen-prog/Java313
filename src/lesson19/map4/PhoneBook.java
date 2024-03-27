package lesson19.map4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        System.out.println(bookPhone);  // {}
        printBook(bookPhone);
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
            String phones = "";  // ""
            int i = 0;  // i = 2
            for (int el : item.getValue()) {
//                phones = phones + el + ", ";  // phones = "449988, " + 116655 + ", "
                phones = phones + el + (item.getValue().size() - 1 == i ? " " : ", ") ;  // "449988, " + 116655 + " "
                i++;
            }
            System.out.printf("%s: %s %n", item.getKey(), phones);
        }
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();  // []
            list.add(value); // [889922]
            map.put(key, list);  // {"Зотов"=[778899, 112233, 445577], "Калинкин"=[449988, 116655], "Романов"=[889922]}
        }
    }
}
