package lessons17.sample4;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-5));

//        Predicate<String> isPalindrome = str -> {
//            String reversed = new StringBuilder(str).reverse().toString();
//            return str.equals(reversed);
//        };
//
//        String world1 = "мадам";
//        boolean res = isPalindrome.test(world1);
//        System.out.println(world1 + " это палиндром: " + res);
//
//        String world2 = "радар";
//        res = isPalindrome.test(world2);
//        System.out.println(world2 + " это палиндром: " + res);

//        Predicate<String> isEmptyString = str -> str.isEmpty();
//
//        String str1 = "";
//        String str2 = "Строка содержит текст!";
//
//        System.out.println("Строка 1: " + str1);
//        System.out.println("Строка 1 пустая: " + isEmptyString.test(str1));
//        System.out.println("Строка 2: " + str2);
//        System.out.println("Строка 2 пустая: " + isEmptyString.test(str2));

//        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
//        System.out.println(convert.apply(5));
//
//        Function<Double, Long> function = d -> Math.round(d);
//        System.out.println(function.apply(5.4));

//        String t = "One";
//        Supplier<String> stringSupplier = () -> t.toUpperCase();
//        System.out.println(stringSupplier.get());

//        Supplier<User> userSupplier = () -> {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Введите имя: ");
//            String name = input.nextLine();
//            return new User(name);
//        };
//
//        User user1 = userSupplier.get();
//        User user2 = userSupplier.get();
//
//        System.out.println("Имя пользователя 1: " + user1.getName());
//        System.out.println("Имя пользователя 2: " + user2.getName());
//        Consumer<Integer> printer = x -> System.out.printf("%d долларов %n", x);
//        printer.accept(700);
//
//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
//        printUpperCase.accept("hello");
//        int x = 5;
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}

//class User{
//    private String name;
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}


