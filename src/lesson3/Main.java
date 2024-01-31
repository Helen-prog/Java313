package lesson3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Циклы
        /*
        while(условие){
            тело цикла;
        }
        Итерация - один шаг цикла
        */
//        int i = 0;  // переменная счетчик
//        while (i < 5){  // условие
//            System.out.println("i = " + i);
//            i++;  // шаг цикла
//        }
//        int i = 100;
//        while (i < 0) {
//            System.out.println(i);
//            i = i / 5;  // i--
//        }

//        int i = 1;
//        while (i <= 20) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        int i = 0;
//
//        while (i < 20) {
//            i += 2;
//            System.out.println(i);
//        }

//        int count = 3;
//        int n, sum = 0;
//        while (count > 0){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;  // sum = sum + n
//            count--;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int a, b, sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        a = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        b = input.nextInt();
//        while (a <= b) {
//            if (a % 2 != 0){
//                sum += a;
//            }
//            a++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int n, orient;
//        System.out.print("Количество символов: ");
//        n = input.nextInt();
//        String symbol;
//        System.out.print("Тип символа: ");
//        symbol = input.next();
//        System.out.print("0 - горизонтальная\n1 - вертикальная\nориентация линии: ");
//        orient = input.nextInt();
//
//        while (n > 0) {
//            if (orient == 0) {
//                System.out.print(symbol + " ");
//            } else {
//                System.out.println(symbol);
//            }
//            n--;
//        }

//        int n;
//        String str;
//        System.out.print("Введите строку: ");
//        str = input.nextLine();
//        System.out.println(str);
//        System.out.print("Введите число: ");
//        n = input.nextInt();  // 6\n
//        System.out.println(n);  // 6
//        input.nextLine();  // \n

//        int i = 1, sum = 0;
//        while (i <= 20) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        /*
        do{
            тело цикла;
        }while(условие);
        */
//        int i = 0;
////        do {
////            System.out.println("i = " + i);
////            i++;  // 1
////        } while (i > 5);  // 1 > 5
//
//        while (i > 5){
//            System.out.println("i = " + i);
//            i++;
//        }
//        int a, sum=0, count=0;
//        double average;
//        do {
//            System.out.print("Введите число (0 - прервать): ");
//            a = input.nextInt();
//            if(a < 0){
//                sum += a;
//                count++;
//            }
//        }
//        while (a != 0) ;
//        average = (double) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);

//        int number, copy, reverse_number = 0, i;
//        System.out.print("Введите число: ");
//        number = input.nextInt();  // 321
//        copy = number;  // 321 => 32 => 3
//        do {
////            i = copy % 10; // 3
//////            reverse_number = i * 10 ;  // reverse_number = 1 * 10 = 10 + 2 = 12
////            reverse_number = reverse_number * 10 + i;  // 0 * 10 + 1 = 1  // 1 * 10 + 2 = 12 // 12 * 10 + 3 = 123
//            reverse_number *= 10; // reverse_number = reverse_number * 10  // 0  // 1 * 10 = 10  // 12 * 10 = 120
//            reverse_number += copy % 10;  // reverse_number = reverse_number + copy % 10 => 0 + 1 = 1  // 10 + 2 = 12
//            // 120 + 3 = 123
//            copy /= 10;  // 0
//        } while (copy > 0);
////        System.out.println(reverse_number);
//        System.out.println("Число " + number + (number == reverse_number ? " " : " не ") + "палиндром");

        // number = 32123 => reverse_number = 32123  // number == reverse_number // 32123 == 32123

//        int i = 0;
//        while (i < 10){
//            if(i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++;  // 5
//        }
//        System.out.println("Цикл завершен");

//        int i = 0;
//        do{
//            if(i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++;
//        }while (i < 10);
//        System.out.println("Цикл завершен");

//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true){
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n <= 0){
//                break;
//            }
//        }

//        int pr = 1, eee;
//
//        while (true) {
//            System.out.print("Введите  число кроме нуля: ");
//            eee = input.nextInt();
//            if (eee == 0) {
//                break;
//            }
//            pr = pr * eee;
//        }
//        System.out.print("pr = " + pr);

//        int ch, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0, count = 0;
//        do {
//            System.out.print("Введите число: ");
//            do {
//                ch = input.nextInt();
//                if (ch < 0) {
//                    System.out.print("Вы ввели отрицательное число.\nВведите положительное число: ");
//                }
//            } while (ch < 0);
//            if (ch < min && ch != 0) {
//                min = ch;
//            }
//            if (ch > max) {
//                max = ch;
//            }
//            sum += ch;
//            if (ch != 0) {
//                count++;
//            }
//        } while (ch != 0);
//        if(sum != 0) {
//            System.out.println("Минимальное число: " + min);
//            System.out.println("Максимальное число: " + max);
//            System.out.println("Сумма: " + sum);
//            System.out.println("Количество: " + count);
//            System.out.printf("Среднее арифметическое: %.2f", (double) sum / count);
//        }else {
//            System.out.println("Вы вводили только отрицательные числа");
//        }

//        int i = 1;
//        while (i < 5){  // 5
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while(j < 4){  // 4
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;
//            }
//            i++;
//        }
//        int i = 1;
//        while (i < 10) {
//            int j = 1;
//            while (j < 10){
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 3) {
//            int j = 0;
//            while (j < 6){
//                System.out.print("^");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                }
//                else {
//                    System.out.print("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {  // 5
//            int j = 0;  // 0
//            while (j < i) {  // 0 < 4
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println("*");
//            i++;
//        }

        /*
        for (инициализация_переменной; условие; шаг_цикла){
            тело цикла;
        }
        */

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        int count = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("-> ");
//            if(input.hasNextInt()){
//                count++;
//            }
//            input.nextLine();  // eee\n
//        }
//        System.out.println("Вы ввели чисел: " + count);


//        int i, j = 0;
//        System.out.print("Введите количество символов: ");
//        i = input.nextInt();
//        while (j < i) {
//            System.out.print("*");
//            j++;
//        }

//        System.out.print("Введите кол-во символов: ");
//        int a = input.nextInt();
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }

//        int i, num;
//        System.out.print("Введите целое число: ");
//        num = input.nextInt();
//        for (i = 1; i <= num; i++){  // 3
//            if (num % i == 0) {
//                System.out.println("Делится на " + i);
//            }
//        }

//        for(int i = 10; i > 0; i--){
//            System.out.print(i + " ");
//        }
//        int i = 10;
//        for (;;) { // i < 100
//            System.out.print(i + " ");
//            if(i == 90){
//                break;
//            }
//            i += 10;
//        }

//        int n, res = 1;
//        for(;true;){
//            System.out.print("-> ");
//            n = input.nextInt();
//            if(n == 0){
//                break;
//            }
//            res *= n;
//        }
//        System.out.println("Произведение введенных чисел: " + res);
//        int a = 1;
//        for(int i = 5, a = 1; i > 0; i--, a++){
//            System.out.println(a + ") Значение: " + i);
//        }
//        for (int x = 0, y = 0; x < 5; x++, y--){
//            System.out.println("x: " + x + ", y: " + y);
//        }

//        for (int i = 10; i <= 100; i++) {
//            if (i % 11 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        for (int i = 10; i < 100; i++) {
//            if (i % 10 == i / 10) {
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println("+++ = " + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.println("----- = " + j);
//            }
//        }

//        int w, h;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();  // 16
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();  // 4
//
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        int size = 4;
//        for (int i = 0; i < size; i++) {  // i = 4
//            for (int j = 0; j <= i; j++) {  // j = 4
////                if (j <= i){  // 3 <= 3
//                    System.out.print("*");
////                }
//            }
//            System.out.println();
//        }

//        int h = 4;
//        int w = h * 2 - 1;  // 5
//        int m = w / 2;  //  5 / 2 = 2
//        for (int i = 0, l = m, r = m; i < h; i++, r++, l--) {  // l = 2, r = 3
//            for (int j = 0; j < w; j++) { // j = 3
//                if (j >= l && j <= r) {  // 3 >= 2 && 3 <= 3
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int size = 7;
//        for (int i = 0; i < size; i++){
//            for (int j = 0; j < size; j++){
//                if (j >= i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        // Массивы
//        int mas[] = new int[4];
//        float[] mas2 = new float[5];
//        int mas3[];
//        mas3 = new int[4];

//        int mas[] = new int[4];
//        int mas[] = new int[] { 2, 7, 5, 3 };
//        int mas[] = { 2, 7, 5, 3 };


//        int mas[] = new int[5];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];  // 2 + 7 = 9
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println(mas.length);  // 4
//        int last = mas[mas.length - 1]; // mas[4-1]
//        System.out.println(last);
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }

//        int n = 100;
//        int[] a = new int[n * 2 + 3];
//        System.out.println(a.length);

//        int n = 10;
//        int[] a = new int[n];
//        a[n - 1] = 2;  // a[9] = 2
//        a[n - 2] = 3;  // a[8] = 3
//        a[n / 5] = a[n - 1] + a[n - 2];  // a[2] = a[9] + a[8] => 5
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        int[] array = new int[4];
////        System.out.print("-> ");
////        array[0] = input.nextInt();
////        System.out.print("-> ");
////        array[1] = input.nextInt();
////        System.out.print("-> ");
////        array[2] = input.nextInt();
////        System.out.print("-> ");
////        array[3] = input.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        int a;
//        System.out.print("Введите кол-во элементов массива: ");
//        a = input.nextInt();
//
//        int[] array;
//        if (a > 5) {
//            array = new int[a];
//
//        } else {
//            array = new int[a];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }

//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(Arrays.toString(array));  // [1, 4, 6, 3, 8]

//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//            if (array[i] < 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//
////        for (int i = 0; i < array.length; i++){
////            if (array[i] < 0) {
////                sum += array[i];
////            }
////        }
//        System.out.println("Сумма отрицательных элементов массива: " + sum);

//        int n;
//        System.out.print("n = ");
//        n = input.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        int min = array[0];  // 9
//        for (int i = 0; i < array.length; i++){
//            if(array[i] < min){  // 45 < 2
//                min = array[i];  // min = 2
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("Минимальный элемент массива: " + min);

//        int n = 6;
//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j <= i) { // 0 <= 1
//                if (j == 0 || i == j || i == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        System.out.print("Введите начало диапазона: ");
//        int k = input.nextInt();  // 5
//        System.out.print("Введите конец диапазона: ");
//        int n = input.nextInt();  // 10
//        int[] array = new int[n - k + 1];
//
//        for (int i = 0, j = k; i <= n - k; i++, j++) {  // i = 6, j = 11
//            array[i] = j;  //  array[0] = 5; array[1] = 6; array[2] = 7; array[3] = 8; array[4] = 9; array[5] = 10;
//            System.out.print(array[i] + "\t");
//        }
//
//        System.out.println("\n" + Arrays.toString(array));

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];  // 4 - 1 = 3
//        for (int i = 0; i < a1.length; i++) {  // a1.length = 4
//            a2[i] = a1[i];  // a2[3] = a1[3]
//        }
////        a1[0] = 5;
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" + Arrays.toString(a2));


//        double a = Math.random() * 3;  // от 0 до 9 (не включительно)
//        System.out.println(a);
//
//        double b = 2 + Math.random() * 5; // от 2 до 7 (не включительно)
//        System.out.println(b);
//
//        double c = Math.random() * 10 - 5; // от -5 до 5 (не включительно)
//        System.out.println(c);
        // Math.random() * (5-(-5)) + (-5);

//        // Math.random() * (max-min) + min;
//        int a = (int) (Math.random() * 3);  // от 0 до 3 (не включительно)
//        System.out.println(a);
//
//        // int b = (int) (Math.random() * 2 + 3);  // от 3 до 5 (не включительно)
//        int b = 3 + (int) (Math.random() * 2);  // от 3 до 5 (не включительно)
//        System.out.println(b);
//
//        int c = (int) (Math.random() * 10 + 1 - 5);  // от -5 до 5 (включительно)
//        System.out.println(c);
//        // Math.random() * (5-(-5)) + 1 + (-5);
//
////        int d = (int) (Math.random() * 10 + 1 - 5);  // от -2 до 4 (включительно)
////        System.out.println(d);
//        int d = (int) (Math.random() * 6 + 1 - 2); // от -2 до 4 (включительно)
//        System.out.println(d);

//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
////            array[i] = (int) (Math.random() * 10);  // от 0 до 10 (не включительно)
////            array[i] = (int) (Math.random() * 12 + 2);  // от 2 до 14 (не включительно)
//            array[i] = (int) (Math.random() * 31 - 15);  // от -15 до 16 (не включительно)
//        }
//        System.out.println(Arrays.toString(array));

//        int sum = 0, count = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);  // от 10 до 50
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            } else {
//                sum += array[i];
//            }
//        }
//        System.out.println("Кол-во четных элементов: " + count);
//        System.out.println("Сумма нечетных элементов: " + sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
////        for (объявление_переменной : выражение) {}
//        for (int x : numbers) {
//            System.out.println("Элемент массива: " + ++x);  // x = x + 1
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));

//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for(String name : names){
//            System.out.println(name);
//        }

//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};  // 4
//        String[] cities2 = new String[cities.length + 1];  // 5
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities));
//        System.out.println(Arrays.toString(cities2));

//        ArrayList <String> cities = new ArrayList<>();
//        cities.add("Брянск");  // добавляет элемент в массив
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1,"Красноярск");
//        cities.add("Армавир");
//
//        System.out.println(cities.get(2));  // получает значение элемента по заданному индексу
//
//        for(String city : cities){
//            System.out.print(city + " ");
//        }
//
//        System.out.println("\n" + cities.indexOf("Владивосток"));  // получаем индекс элемента по заданному значению
//
//        cities.set(2, "Курск");  // устанавливаем новое значение по заданному индексу
//
//        cities.remove(1);  // удаляет элемент по заданному индексу (может удалять по заданному значению)
//        for(String city : cities){
//            System.out.print(city + " ");
//        }
//
//        if(cities.contains("Курск")){  // проверка на существование элемента в массиве ArrayList
//            System.out.println("\nArrayList содержит Курск");
//        }
//        System.out.println(cities.contains("Курск"));
//
//        System.out.println(cities.size());
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка. Условие выхода 0 или отрицательное число:");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        for(int m : mas){
//            System.out.print(m + "\t");
//        }

//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for(int m : mas){
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//
//        for (int i = 0; i < 10; i++) {
//            if(mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("index: " + ind);
//        mas.remove(ind);
//
//        mas.add(0, max);
//
//        for(int m : mas){
//            System.out.print(m + "\t");
//        }


//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        if(a.size() > b.size()) {
//            for (int i = 0; i < b.size(); i++) {
//                c.add(a.get(i));
//                c.add(b.get(i));
//            }
//            for (int i = b.size(); i < a.size(); i++) {
//                c.add(a.get(i));
//            }
//        }
//        else {
//            for (int i = 0; i < a.size(); i++) {
//                c.add(a.get(i));
//                c.add(b.get(i));
//            }
//            for (int i = a.size(); i < b.size(); i++) {
//                c.add(b.get(i));
//            }
//        }
//
//        for(int m : c){
//            System.out.print(m + "\t");
//        }


//        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        for (int i = 0; i < num.length; i++) {
//            for(int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++){
////                num[i][j] *= num[i][j];  //  num[i][j] = num[i][j] * num[i][j];
//                System.out.print(num[i][j] * num[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 5, m = 7;
//        char[][] graph = new char[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++){
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "  ");
//            }
//            System.out.println();
//        }

//        int n = 3, m = 4, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mas[i][j] = (int) (Math.random() * 31 - 20);
//                if(mas[i][j]<0){
//                    count++;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mas[i][j] + "\t\t");
////                if(mas[i][j]<0){
////                    count++;
////                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);
//        System.out.println(mas[0][0]);

//        int[] array = new int[10];
//        int c, j;
//        for (int i = 0; i < array.length; i++) {
//            c = (int) (Math.random() * 10);
////            int j = 0;
////            while (j < i) {
////                if (c != array[j]) {
////                    j++;
////                } else {
////                    c = (int) (Math.random() * 10);
////                    j = 0;
////                }
////            }
//            for (j = 0; j < i; ) {
//                if (c != array[j]) {
//                    j++;
//                } else {
//                    c = (int) (Math.random() * 10);
//                    j = 0;
//                }
//            }
//            array[i] = c;
//        }
//        System.out.println(Arrays.toString(array));

//        int sum = Integer.MAX_VALUE;
//        int tmp = 0, n = 1;
//        int arr[][] = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                tmp += arr[i][j];
//            }
//            if (sum > tmp) {
//                sum = tmp;
//                n = i;
//            }
//
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + tmp);
//            tmp = 0;
//
//        }
//        System.out.println("\nСтрока с минимальной суммой элементов " + sum + ", имеет номер " + (n + 1));

//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//
//        int[][] mas1 = new int[][] {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                System.out.print(mas1[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int arr[][] = new int[n][];
////        arr[0] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int arr[][] = new int[n][];
////        arr[0] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[arr.length - i];
//        }
//        int count = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int tp[][] = new int[n][];
//        for (int i = 0; i < n; i++) {  // 2
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {  // 1 < 2
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//
//        for (int i = 0; i < tp.length; i++) {
//            for(int j = 0; j < n - i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }
    }
}
