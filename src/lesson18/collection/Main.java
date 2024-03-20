package lesson18.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Валерий");
        arrayList1.add("Ирина");
        arrayList1.add("Игорь");
        System.out.println(arrayList1);  // [Валерий, Ирина, Игорь]

//        ArrayList<String> arrayList2 = new ArrayList<>(20);
//        arrayList2.add("Валерий");
//        arrayList2.add("Ирина");
//        arrayList2.add("Игорь");
//        System.out.println(arrayList2.size());
//        System.out.println(arrayList2);  // [Валерий, Ирина, Игорь]
//
//        List<String> arrayList3 = new ArrayList<>();
//        arrayList3.add("Валерий");
//        arrayList3.add("Ирина");
//        System.out.println(arrayList3);  // [Валерий, Ирина]
//
//        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
//        System.out.println(arrayList4);
//        arrayList4.add("Владимир");
//        System.out.println(arrayList4);  // [Валерий, Ирина, Игорь, Владимир]
//        System.out.println(arrayList1);  // [Валерий, Ирина, Игорь]
//
//        ArrayList arrayList5 = new ArrayList<>();
//        arrayList5.add("Валерий");
//        arrayList5.add(7);
//        arrayList5.add(true);
//        System.out.println(arrayList5);  // [Валерий, 7, true]
//
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");

//        arrayList6.addAll(arrayList1);
//        System.out.println(arrayList6);  // [!!!, ???, Валерий, Ирина, Игорь]
//
        arrayList6.addAll(1, arrayList1);
        System.out.println(arrayList6);  // [!!!, Валерий, Ирина, Игорь, ???]
//
////        arrayList1.set(2, "Александр");
////        System.out.println(arrayList1);
////        arrayList6.removeAll(arrayList1);
////        System.out.println(arrayList6);  // [!!!, ???]
//
////        arrayList6.retainAll(arrayList1);
////        System.out.println(arrayList6);  // [Валерий, Ирина, Игорь]
//
//        List<String> myList = arrayList6.subList(0, 3);
//        System.out.println(myList);
//        myList.add("Борис");
//        System.out.println(myList);
//        System.out.println(arrayList6);

//        String[] array = arrayList6.toArray(new String[8]);
//        String[] array = arrayList6.toArray(new String[2]);
//        for (String s : array) {
//            System.out.print(s + " ");
//        }
//        System.out.println("\n" + array.length);

//        Collections.sort(arrayList6);
//        Collections.shuffle(arrayList6);
//        Collections.reverse(arrayList6);
//        Collections.swap(arrayList6, 0, 2);
//        System.out.println(arrayList6);

        Iterator<String> iterator = arrayList6.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList6);
    }
}
