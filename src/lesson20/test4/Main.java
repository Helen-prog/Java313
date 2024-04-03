package lesson20.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Stream.of("Язык", "программирования", "Java")
                .map(s -> s.length()) // [4, 16, 4]
                .reduce(0, Integer::sum);
        System.out.println(sum);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.addAll(Arrays.asList(5, 4, 7, 8, 6, 1, 2, 3));
//
//        Optional<Integer> result = numbers.stream().reduce((x, y) -> x + y);
//        System.out.println(result.get());
//
//        Stream<String> wordsStream = Stream.of("Язык", "программирования", "Java");
////        Optional<String> sentence = wordsStream.reduce((x, y) -> x + " " + y);
//        String sentence = wordsStream.reduce("Результат:", (x, y) -> x + " " + y);
//        System.out.println(sentence);


//        Stream<Integer> num = Stream.of(5, 4, 7, 8, 6, 1, 2, 3);
//        Optional<Integer> res = num.reduce((x, y) -> x + y);
//        System.out.println(res.get());


//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        if (min.isPresent() || max.isPresent()) {
//            System.out.println(min.get());
//            System.out.println(max.get());
//        } else{
//            System.out.println("Список пуст");
//        }
//        Stream<String> people1 = Stream.of("Виктор", "Екатерина", "Дмитрий");
//        Stream<String> people2 = Stream.of("Александр", "Виктория", "Дмитрий");
//
//        Stream.concat(people1, people2).distinct().forEach(n -> System.out.println(n));
//        Stream.concat(people1, people2).forEach(n -> System.out.println(n));

//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n));  // -5, -4, -3, -2, -1, 0, 1, 2, 3
//        numbers.sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
//        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
//        numbers.filter(n -> n < 0).forEach(n -> System.out.println(n));
    }
}
