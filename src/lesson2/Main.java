package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Введите число: ");
//        int num = input.nextInt();
//        System.out.printf("Вы ввели число: %d", num);
//        System.out.print("Имя: ");
//        String name = input.next();
//        System.out.print("Возраст: ");
//        int age = input.nextInt();
//        System.out.print("Рост: ");
//        float height = input.nextFloat();
//        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f", name, age, height);

//        System.out.print("Введите число a = ");
//        int a = input.nextInt();
//        System.out.print("Введите число b = ");
//        int b = input.nextInt();
//        System.out.print("Введите число c = ");
//        int c = input.nextInt();
//        System.out.print("Введите число d = ");
//        int d = input.nextInt();
////        int num1 = a + b;
////        int num2 = c + d;
////        double calc = (double) num1 / num2;
//        double calc = (double) (a + b) / (c + d);
//        System.out.printf("Результат: %.2f", calc);


//        input.close();

//        int a = 5;
//        a += 10;  // a = a + 10
//        System.out.println(a);  // 15
//
//        a -= 7;  // a = a - 7
//        System.out.println(a);  // 8
//        //  a++ => a = a + 1

//        int a, b, c, sum;
//        System.out.print("Введите 1 число: ");
//        a = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        b = input.nextInt();
//        System.out.print("Введите 3 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int sum;
//        System.out.print("Введите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum += input.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += input.nextInt();
//        System.out.println("Сумма чисел: " + sum);

//        int a = 8;
//        int b = 3;
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);

//        boolean a1 = 5 < 6 && 4 < 6;  // true && true  =>  true
//        boolean a2 = 5 > 6 && 4 < 6;  // false && true  => false
//        boolean a3 = 5 < 6 && 4 > 6;  // true && false  => false
//        boolean a4 = 5 > 6 && 4 > 6;  // false && false  => false
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);

//        boolean a1 = 5 < 6 || 4 < 6;  // true || true  =>  true
//        boolean a2 = 5 > 6 || 4 < 6;  // false || true  => true
//        boolean a3 = 5 < 6 || 4 > 6;  // true || false  => true
//        boolean a4 = (5 > 6) || (4 + 3 > 6);  // false || true  => true
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println(!(4 < 6));
//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать!");
//        } else {
//            System.out.println("Доступ запрещен");
//            System.out.println("Можно будет попасть на сайт с 18 лет");
//        }

//        int num1 = 25;
//        int num2 = 25;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго");
//        }
//        if (num2 > num1){
//            System.out.println("Второе число больше первого");
//        }
//        if (num1 == num2){
//            System.out.println("Числа равны");
//        }

//        int num1 = 15;
//        int num2 = 15;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго");
//        }
//        else if (num2 > num1){
//            System.out.println("Второе число больше первого");
//        }
//        else{
//            System.out.println("Числа равны");
//        }
//        int age;
//        String name ;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
////        name=input.nextLine();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите свое имя: ");
//        name = sc.nextLine();
//        System.out.println(age);
//        System.out.println(name);

//        int age = 8;
//        boolean isYoung = age >= 18;  // true
//        boolean isOld = age <= 65;  // true
//        if(!isYoung || !isOld){  // false && false
//            System.out.println("Работать не обязательно");
//        }
//        else{
//            System.out.println("Вы можете работать");
//        }

//        int a = 30, b = 20, c = 10;
//        if (a == b && b == c && a == c){
//            System.out.println("Треугольник равносторонний");
//        } else if (a == b || b == c || a == c) {
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник разносторонний");
//        }

//        int n;
//        System.out.print("Введите количество ворон (0-9): ");
//        n = input.nextInt();
//        if(n >= 0 && n <= 9){
//            System.out.print("На ветке ");
//            if (n == 1){
//                System.out.println(n + " ворона");
//            } else if(n >= 2 && n <= 4){
//                System.out.println(n + " вороны");
//            } else if(n == 0 || (n >= 5 && n <= 9)){
//                System.out.println(n + " ворон");
//            }
//        }
//        else{
//            System.out.println("Ошибка ввода данных");
//        }

//        int n;
//        System.out.print("Введите количество ворон (0-9): ");
//        n = input.nextInt();
//
//        if (n == 1) {
//            System.out.println("На ветке " + n + " ворона");
//        } else if (n >= 2 && n <= 4) {
//            System.out.println("На ветке " + n + " вороны");
//        } else if (n == 0 || (n >= 5 && n <= 9)) {
//            System.out.println("На ветке " + n + " ворон");
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        int day, time;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5){
//            System.out.print("Введите время: ");
//            time = input.nextInt();
//            System.out.print("Рабочий день. ");
//            if (time >= 8 && time <= 17){
//                System.out.println("Открыто");
//            }else {
//                System.out.println("Закрыто. Откроется в 8:00");
//            }
//        }
//        else if(day==6 || day==7){
//            System.out.println("Выходной день.");
//        }
//        else {
//            System.out.println("Такого дня недели не существует");
//        }
//        Scanner sc = new Scanner(System.in);
//        int numDay;
//        System.out.print("Введите день недели цифрами: ");
//        numDay = sc.nextInt();
//        if (numDay >= 1 && numDay <= 5) {
//            System.out.print("Рабочий день. ");
//            if (numDay == 1) System.out.print("Понедельник");
//            if (numDay == 2) System.out.print("Вторник");
//            if (numDay == 3) System.out.print("Среда");
//            if (numDay == 4) System.out.print("Четверг");
//            if (numDay == 5) System.out.print("Пятница");
//        } else if (numDay == 6 || numDay == 7){
//            System.out.print("Выходной день. ");
//            if (numDay == 6) System.out.print("Суббота");
//            if (numDay == 7) System.out.print("Воскресенье");
//        } else {
//            System.out.println("Несуществующий день недели");
//        }

//        int number, res;
//        number = 10;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра!" : "Вам рано еще смотреть этот фильм");

//        int a = 30, b = 30, c;
//        System.out.println(a == b ? c = 9 : (a > b ? "a > b" : "b > a"));

//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);  // 20

//        int a = 20, b = 0;
//        System.out.println(b == 0 ? "На 0 делить нельзя" : (float) a / b);

//        int n;
//        System.out.print("\t Выбор цвета светофора\n1 (11) - красный, 2 (22) - желтый, 3 (33) - зеленый: ");
//        n = input.nextInt();
//
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");
//        }
//        System.out.println("Hello");

//        float a, b;
//        System.out.print("Введите значение a: ");
//        a = input.nextFloat();
//        System.out.print("Введите значение b: ");
//        b = input.nextFloat();
//        System.out.println(b == 0 ? "На 0 делить нельзя" : a / b);

//        int n, kop;
//        System.out.print("Введите число от 1 до 99: ");
//        n = input.nextInt();
//        kop = n;
//        if (n >= 11 && n <= 14) {
//            System.out.println(n + " копеек");
//        } else {
//            kop = kop % 10;
//            if(kop == 1){
//                System.out.println(n + " копейка");
//            } else if(kop >= 2 && kop <= 4){
//                System.out.println(n + " копейки");
//            } else{
//                System.out.println(n + " копеек");
//            }
//        }

//        int month;
//        int year;
//        int numDays = 0;
//        System.out.println("Запросить у пользователя номер месяца числом и год,\nдля нахождения " +
//                "количества дней в феврале\n");
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0) {
//                    numDays = 29;
//                } else {
//                    numDays = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        System.out.println("Количество дней: " + numDays);
//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1, 2, 12 -> System.out.println("Зима!");
//            case 3, 4, 5 -> System.out.println("Весна!");
//            case 6, 7, 8 -> System.out.println("Лето!");
//            case 9, 10, 11 -> System.out.println("Осень!");
//            default -> System.out.println("Такого месяца не существует!");
//        }

//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        String s = switch (month) {  // month == 3 || month == 4 || month == 5
//            case 1, 2, 12 -> "Зима!";
//            case 3, 4, 5 -> "Весна!";
//            case 6, 7, 8 -> "Лето!";
//            case 9, 10, 11 -> "Осень!";
//            default -> "Такого месяца не существует!";
//        };
//        System.out.println(s);
//        input.close();

//        System.out.print("Введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//
//        System.out.print("Ваш балл по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("такого значения нет");
//        }

    }
}
