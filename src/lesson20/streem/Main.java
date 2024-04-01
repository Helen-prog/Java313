package lesson20.streem;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List <String> colors = Arrays.asList("Красный", "Кремовый", "Синий", "Зеленый", "Коричневый", "Серый");
        System.out.println("Исходный список цветов: " + colors);
        char start = 'К';
        long ctr = colors.stream().filter(s -> s.startsWith(String.valueOf(start))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start + "': " + ctr);
        char start1 = 'С';
        long ctr1 = colors.stream().filter(s -> s.startsWith(String.valueOf(start1))).count();
        System.out.println("\nКоличество цветов, которые начинаются с '" + start1 + "': " + ctr1);
//
//        int[] numbers = {-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5};
//        int count = 0;
//        for (int i : numbers) {
//            if (i > 0) count++;
//        }
//        System.out.println(count);  // 5
//        long count = IntStream.of(-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5).filter(w -> w > 0).count();
//        System.out.println(count);
//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        cityStream.filter(s -> s.length() >= 6).forEach(System.out::println);

//        String[] arguments = {"one", "first", "two", "second", "three", "third", "four", "fourth", "five", "fifth"};
//        Map<String, String> aMap = new LinkedHashMap<>(arguments.length / 2);
//        for (int i = 0; i < arguments.length; i += 2) {
//            aMap.put(arguments[i], arguments[i + 1]);
//        }
//        System.out.println(aMap);
//        aMap.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));

//        Stream<String> cityStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});
//        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        cityStream.forEach(s -> System.out.print(s + " "));
//        System.out.println(cityStream);
//        cityStream.forEach(System.out::println);
//        System.out.println();

//        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7});
//        intStream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//
//        LongStream longStream = Arrays.stream(new long[]{100, 250, 3578, 47879, 546541, 64131, 778});
//        longStream.forEach(i -> System.out.print(i + " "));
//
//        System.out.println();
//        double[] d = new double[]{1, 2, 3, 4, 5, 6, 7};
//        DoubleStream doubleStream = DoubleStream.of(d);
//        doubleStream.forEach(i -> System.out.print(i + " "));
    }
}
