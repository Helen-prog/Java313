package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        hello("Irina");
//        hello("Igor");
//        getSum(2, 5);
//        int a = 1;
//        int b = 7;
//        getSum(a, b);
//        int n1 = 3;
//        int n2 = 7;
//        getSum(n1, n2);
//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', '0');

//        int a = 30;
//        int b = 45;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swapFunction(a, b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        int a = 11;
//        int b = 16;
//        int c = min(a, b);
//        System.out.println("Минимальное значение = " + c);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите а: ");
//        int a = input.nextInt();
//
//        System.out.print("Введите b: ");
//        int b = input.nextInt();
//        int c = func1(a, b);
//        System.out.println("Значение = " + c);

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }

//        printLine(1, 1);
//        printLine(1, 2);
//        printLine(1, 3);
//        printLine(1, 4);
//        printLine(1, 5);
//
//        printLine(1, 4);
//        printLine(1, 3);
//        printLine(1, 2);
//        printLine(1, 1);

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n - 1; i > 0; i--) {
//            printLine(1, i);
//        }
//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();
//        sum(10, "Welcome!", "20");
//        sum( 1,"Hello World!", "a", "b");
//        sum( 1);

//        func_num(2, 7, 0, 3, 1, 5, -13);
//        func_num(2, 7, 0, 3, 1, 5, -13, 13);
//        func_num(26);
//        func_num(99, 99, 100, 34, -93);
//        func_num(99, 39, 99, 100, 34);
//        func_num();

        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(ch(3, 6, 1, 9, 5));
    }

    public static ArrayList ch(int... args){
        ArrayList<Integer> mas = new ArrayList<>();
        double sum = 0;
        int count = 0;
        double average;
        for(int i: args){
            sum += i;
            count += 1;
        }
        average = sum / count;
        System.out.println("Среднее арифметическое: " + average);
        for (int i: args){
            if(i < average){
                mas.add(i);
            }
        }
        return mas;
    }

//    public static void func_num(int... args) {
//        int max = -1;
//        for (int i : args) {
//            if (i % 13 == 0 && i > 0) {
//                max = i;
//            }
//        }
//        if (max != -1) {
//            System.out.println(max);
//        } else {
//            System.out.println("Число не найдено");
//        }
//    }

//    public static void func_num(int... args) {
//        int max = args[0];
//        for(int i : args){
//            if(i % 13 == 0 && i > 0) {
//                max = i;
//            }
//        }
//        if(args[0] % 13 != 0 && max == args[0]) {
//            System.out.println("Число не найдено");
//        }
//        else {
//            System.out.println(max);
//        }
//    }


//    public static void sum(int nums, String... message) {
//        System.out.println(message);
//        int res = 0;
//        for(int n: nums){
//            res += n;
//        }
//        for(String s: message){
//            System.out.println(s);
//        }
//        System.out.println(res);
//    }

//    public static void printLine(int start, int end) {
//        for (int i = start; i <= end; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }

//    public static int cub(int a){
//        return a * a * a;
//    }

//    public static int func1(int n1, int n2) {
//
//        if (n1 > n2) {
//            System.out.println("Hello");
//            return n1 - n2;
//        } else {
//            return n1 + n2;
//        }
//    }
//    public static int func1(int n1, int n2) {
//        int res;
//        if (n1 > n2) {
//            res = n1 - n2;
//        } else {
//            res = n1 + n2;
//        }
//        return res;
//    }

//    public static int min(int n1, int n2){
//        int min;
//        if(n1 > n2){
//            min = n2;
//        } else{
//            min = n1;
//        }
//        return min;
//    }

//    public static void swapFunction(int n, int m){
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//        int c = n;
//        n = m;
//        m = c;
//        System.out.println("----------------------------------");
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//    }

//    public static void symbolDraw(int count, char a, char b) {
//        for (int i = 0; i < count; i++) {
//            if (i % 2 == 0) {
//                System.out.print(a);
//            } else {
//                System.out.print(b);
//            }
//        }
//        System.out.println();
//    }

//    public static void getSum(int a, int b){
//        System.out.println(a + b);
//    }

//    public static void hello(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
}
