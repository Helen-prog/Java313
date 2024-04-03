package lesson20.test2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> phones = new ArrayList<>();
        Collections.addAll(phones,"iPhone X", "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
//        phones.addAll(Arrays.asList("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
//                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2"));
        System.out.println(phones);

        List<String> filterPhones = phones.stream().filter(s -> s.length() < 10).collect(Collectors.toList());
        System.out.println(filterPhones);

        Set<String> filterPhones1 = phones.stream().filter(s -> s.length() < 10).collect(Collectors.toSet());
        System.out.println(filterPhones1);

        TreeSet<String> filterPhones2 = phones.stream().filter(s -> s.length() < 10).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(filterPhones2);
//        boolean any = phones.stream().anyMatch(s -> s.length() > 10);
//        System.out.println(any);
//
//        boolean all = phones.stream().allMatch(s -> s.length() > 10);
//        System.out.println(all);
//
//        boolean non = phones.stream().noneMatch(s -> s.length() < 2);
//        System.out.println(non);

//        Optional<String> first = phones.stream().findFirst();
//        System.out.println(first.get());
//
//        Optional<String> any = phones.stream().findAny();
//        System.out.println(any.get());

//        System.out.println(phones);
//        int pageSize = 3;
//        while (true){
//            System.out.print("Введите номер страницы: ");
//            int page = input.nextInt();
//
//            if (page < 1){
//                break;
//            }
//
//            phones.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(s -> System.out.println(s));
//        }

//        Stream<String> phoneStream = Stream.of("iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8", "LG G6");
//
//        phoneStream.skip(1).limit(2).forEach(s -> System.out.println(s));

//        List<String> phones = new ArrayList<>();
//        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P", "Samsung Galaxy S8",
//                "LG G6", "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");
//
//        System.out.println(phones);
//        phones.stream().filter(p -> p.length() < 12).sorted().forEach(s -> System.out.println(s));
    }
}
