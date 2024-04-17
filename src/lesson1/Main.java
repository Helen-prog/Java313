package lesson1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

/*
        System.out.println("Привет Мир!");
        System.out.println("Hello");
//        System.out.println();
        System.out.print("Hello");
        System.out.print("World");
      int a;  // создали переменную
        int b;
        a = 10;  // присвоили значение
        b = 20;
        System.out.println(a);
        System.out.println(b);
//        int a, b;
//        a = 10;
//        b = 20;
//        System.out.println(a);
//        System.out.println(b);
//        int a = 10, b = 20;  // инициализация переменной
//        System.out.println(a);
//        System.out.println(b);
//        var a = "10";
//        System.out.println(a);
//        a = 25;
//        System.out.println(a);

//        final int WEEK;
//        WEEK = 7;
//        System.out.println(WEEK);

       // boolean (Boolean)
        System.out.println(5 < 3);
        boolean b = false;
        System.out.println(b);
        System.out.println(Boolean.TYPE);

        // char (Character)
        char ch = '*';
        ch = '\u27a5';
        ch = 1084;
        System.out.println(ch);
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);

        // byte (Byte)
        byte a = 12;
        System.out.println(a);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        byte a = 12;
        System.out.println("a = " + a);

       short a = 3;
        System.out.println(a);
//        var a = 3;
//        System.out.println(3);

        // int (Integer)
       System.out.println("Переменная типа int занимает " + Integer.BYTES + " байт в памяти (" + Integer.SIZE + " бит " +
                "в памяти)," + " и принимает значения в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);

        long a = 5;
        System.out.println(a);

        int a = 5;
        int b = 7;
        int c;
        a = 28;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        c = a;  // c = 5
        a = b;  // a = 7
        b = c;  // b = 5
        System.out.println("a: " + a);  // 7
        System.out.println("b: " + b);  // 5*/

//        float a = 8.5F;
//        System.out.println(a);
//        double b = 8.5;
//        System.out.println(b);

//        System.out.println(((Object)512).getClass().getSimpleName());
//        int a = 512;
//        System.out.println(a);
//        long b = 12345678901L;
//        System.out.println(b);

//        int num2 = 0b10010;
//        System.out.println(num2);
//        int num8 = 022;
//        System.out.println(num8);
//        int num16 = 0x12;
//        System.out.println(num16);
//        System.out.println(num2 + num16);

//        int x = 123_456__789;
//        System.out.println(x);
//        double y = 243_567.798__102;
//        System.out.println(y);

//        double d1 = 0.512;
////        double d2 = .512;
////        double d3 = 512.;
////        System.out.println(d1);
////        System.out.println(d2);
////        System.out.println(d3 + 512.);
////        System.out.println(512.);
////        float f1 = .512F;
////        System.out.println(f1);

//        String text = "\tHello \nworld";
//        System.out.println(text);
//        System.out.println("    Путь к каталогу \"folder\" находится D:\\folder\\file.txt");
//
//        System.out.print("2 + 2 = 5");  // "2 + 2 = 4"
//        System.out.print("\b");
//        System.out.print("4");
//        System.out.print("\r");
//        System.out.print("Новый текст");

//        System.out.print("5 + 3 = ");
//        System.out.println(5 + 3);
//        System.out.println("5 + 3 = " + (5 + 3));
//        System.out.printf("5 + 3 = %d %n", 5 + 3);
//        byte a = 5;
//        int b = 6;
//        System.out.printf("a = %d, b = %d %n", a, b);
//        System.out.println("a = " + a + ", b = " + b);

//        String name = "Ирина";
//        int age = 25;
//        double height = 1.7;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f.", name, age, height);

//        System.out.printf("%8d");

//        System.out.println(5 + 2);
//        System.out.println(5 - 2);
//        System.out.println(5 * 2);
//        System.out.println(5 / 2);  // 2.5 => 2
//        System.out.println(5.0 / 2);  // 2.5
//        System.out.println(5 / 2.0);  // 2.5
//        System.out.println(5 % 2);  // 1

/*        int num = 4321;  // 4
        int a, b, c, d, res;
        System.out.printf("Исходное число: %d %n", num);
        a = num % 10;
        System.out.println("a: " + a);
        num = num / 10;
//        System.out.println(num);
        b = num % 10;
        System.out.println("b: " + b);
        num = num / 10;
//        System.out.println(num);
        c = num % 10;
        System.out.println("c: " + c);
        num = num / 10;
//        System.out.println(num);
        d = num % 10;
        System.out.println("d: " + d);

        res = a * 1000 + b * 100 + c * 10 + d;
        System.out.printf("Обратное число: %d", res);*/


        // ++a, a++ - инкремент - добавление 1
        // --a, a-- - декремент - вычитание 1
//        int a = 8;
//        int b = 8;
//        a++;
//        ++b;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 8;
//        int b = ++a;
//        System.out.println(a);  // 9
//        System.out.println(b);  // 9

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3;  // c = 3 + 1 => 4   a = 2
//        int d = 3 + ++b;  // d = 2 + 3 => 5   b = 2
//
//        System.out.println(a);  // 2
//        System.out.println(b);  // 2
//        System.out.println(c);  // 4
//        System.out.println(d);  // 5

//        int a = 2;
//        int b = a++;  // b = 2,  a = 3
//        int c = b + 3 + a;  // c = 2 + 3 + 3
//        System.out.println(c);  // 8

//        int a = 2;
//        int b = ++a;  // b = 3,  a = 3
//        int c = b + 3 + a;  // c = 3 + 3 + 3
//        System.out.println(c);  // 9

//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * ++b;  // (1 + 5) * 2
//        System.out.println(c);  // 12
//        System.out.println(b);  // 3

        // a++ => ++a => a = a + 1

//        System.out.printf("%8d%n", 123);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%n", 123456789);
//        System.out.printf("%6.2f%n", 123.45789);
//        System.out.printf("%-6s%5d%n", "num =", 456);

//        System.out.printf("--------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES      %n");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "boolean", "boolean", 1);
//        System.out.printf("--------------------------------%n");

        // Преобразование базовых типов данных
//        int x = 5;
//        byte y = (byte) x;
//        System.out.println(y);
//        byte x = 5;
//        int y = x;
//        System.out.println(y);
//        int x = 7654321;
//        float y = x;
//        System.out.println(y);

//        int x = 258;
//        byte y = (byte) x;
//        System.out.println(y);

//        long x = 5;
//        double x = 18.9848;
//        int y = (int)Math.round(x);
//        System.out.println(y);

//        int a = 5, b = 10, c = 7;
////        int sum = a + b + c;
////        int mltply = a * b * c;
////        float avrg = (float) sum / 3;
////
////        System.out.println(sum);
////        System.out.println(mltply);
////        System.out.printf("%.2f", avrg);

//        int a = 5;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println(c);
//
        int d = 'a' + 3;
        System.out.println(d);

    }
}