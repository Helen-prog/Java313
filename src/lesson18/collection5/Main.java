package lesson18.collection5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Валентин");
//        set.add("Николай");
//        set.add("Григорий");
//        set.add("Александр");
//        set.add("Александр");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s);
//        }
//        set.remove("Александр");
//        System.out.println();
//        set.add(null);
//        for (String s : set) {
//            System.out.println(s);
//        }
//        System.out.println(set.size());
//        System.out.println(set.contains("Александр"));
//        System.out.println(set.contains("Григорий"));
//        Set<Integer> a = new HashSet<>();
//        Set<Integer> b = new HashSet<>();
//
//        a.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        b.addAll(Arrays.asList(5, 6, 7, 8, 9));
//
//        System.out.println(a);
//        System.out.println(b);
//
//        HashSet<Integer> union = new HashSet<>(a);
//        System.out.println(union);
//        union.addAll(b);
//        System.out.println(union);
//
//        HashSet<Integer> intersect = new HashSet<>(a);
//        intersect.retainAll(b);
//        System.out.println(intersect);
//
//        HashSet<Integer> subtract = new HashSet<>(a);
//        subtract.removeAll(b);
//        System.out.println(subtract);

//        Set<Integer> num = new HashSet<>();
//        num.add(21);
//        num.add(24);
//        num.add(54);
//        num.add(43);
//        num.add(31);
//        System.out.println(num);
//
//        Integer max = null;
//        for (Integer item : num) {
//            if (max == null) {
//                max = item;
//            }
//            else if (max < item) {
//                max = item;
//            }
//        }
//        System.out.println("Максимальное значение: " + max);
//        System.out.println("Минимальное значение: " + Collections.min(num));

        int[] arr = {2, 5, 2, 7, 8, 8, 10};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num: set) {
            uniqueArr[i++] = num;
        }

        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArr));
    }
}
