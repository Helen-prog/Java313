package lesson19.map3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(new Key("Виталий"), 20);
        map.put(new Key("Александр"), 30);
        map.put(new Key("Виталий"), 40);
        map.put(new Key("Александра"), 25);
        System.out.println();
        System.out.println("Значение для ключа Александр: " + map.get(new Key("Александр")));
        System.out.println("Значение для ключа Виталий: " + map.get(new Key("Виталий")));
        System.out.println("Значение для ключа Александра: " + map.get(new Key("Александра")));
//        map.put(new Key("Виталий"), 20);
//        System.out.println("Значение для ключа Виталий: " + map.get(new Key("Виталий")));
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);  // 16 * 0.75 = 12
    }
}

class Key{
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("hasCode для ключа: " + key + " = " + hash);
        return hash;
    }

//
//    @Override
//    public boolean equals(Object obj) {
//        return key.equals(((Key) obj).key);
//    }
}
