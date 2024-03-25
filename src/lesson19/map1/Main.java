package lesson19.map1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов");
        map1.put(778899, "Ринат Зуев");
        map1.put(443366, "Роман Свиридов");
        map1.put(225577, "Анна Полякова");
        System.out.println(map1);
//        map1.put(884466, "Анна Полякова");
//        map1.putIfAbsent(334466, "Ирина Мельник");
////        map1.put(null, "Ирина Мельник");
////        map1.put(779944, null);
//        System.out.println(map1);
//        System.out.println(map1.get(778899));
//        System.out.println(map1.get(778800));
//        map1.remove(443366);
//        System.out.println(map1);
        System.out.println(map1.containsValue("Роман Свиридов"));
        System.out.println(map1.containsValue("Валентин Свиридов"));
        System.out.println(map1.containsKey(225577));
        System.out.println(map1.containsKey(225566));

        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
