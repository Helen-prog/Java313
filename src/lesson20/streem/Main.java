package lesson20.streem;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream<String> cityStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});
        Stream<String> cityStream = Stream.of("Сочи", "Москва", "Калининград");
//        cityStream.forEach(s -> System.out.print(s + " "));
        System.out.println(cityStream);
        cityStream.forEach(System.out::println);
        System.out.println();

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
