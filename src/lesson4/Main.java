package lesson4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = 5.95f;
//
//        System.out.println(Math.PI);
//        System.out.println(Math.round(num));  // 5  6
//        System.out.println(Math.ceil(num));  // 6.0
//        System.out.println(Math.floor(num));  // 5.0
//        System.out.println(Math.sqrt(4));  // 2.0
//        System.out.println(Math.pow(4, 2));  // 16.0
//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", 2 * Math.PI * radius);

//        int kat1, kat2;
//        System.out.print("Катет 1: ");
//        kat1 = input.nextInt();
//        System.out.print("Катет 2: ");
//        kat2 = input.nextInt();
////        System.out.print("Гипотенуза: " + Math.hypot(kat1, kat2));
//        System.out.print("Гипотенуза: " + Math.sqrt(kat1 * kat1 + kat2 * kat2));

//        Date current = new Date();
//        Date current = new Date();  // 123, 2, 9, 12,15,0
//        System.out.println(current);
////        System.out.println(current.getYear());
////        System.out.println(current.getMonth());
////        current.setMonth(5);
////        System.out.println(current);
//        System.out.println(current.getTime());
//        System.out.printf("%1$s %2$td %2$tB %2$tY %n", "Дата:", current);
//        System.out.printf("%s %te %<tB %<tY %n", "Дата:", current);
//        current.setTime(Date.parse("Jul 06 12:15:00 2021"));
//        System.out.println(current);

//        Calendar calendar = new GregorianCalendar();  // 2022, 03,12
////        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.ERA));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR));
//
//        GregorianCalendar calendar1 = new GregorianCalendar();  // 2023, 02, 12
//        int year = calendar1.get(Calendar.YEAR);
//        System.out.println(calendar1.isLeapYear(year));
//        System.out.println(calendar1.get(Calendar.MONTH));
//        System.out.println(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.print(calendar1.get(Calendar.HOUR) + ":");
//        System.out.print(calendar1.get(Calendar.MINUTE) + ":");
//        System.out.println(calendar1.get(Calendar.SECOND));
//        String[] mounths = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//
//        GregorianCalendar calendar2 = new GregorianCalendar();
//
//        calendar2.set(Calendar.YEAR, 2024);
//        calendar2.set(Calendar.MONTH, 0);
//        calendar2.set(Calendar.DAY_OF_MONTH, 15);
//
//
//        System.out.print("Дата: " + mounths[calendar2.get(Calendar.MONTH)] + " ");
//        System.out.print(calendar2.get(Calendar.DATE) + " ");
//        System.out.println(calendar2.get(Calendar.YEAR) + " ");
//        System.out.print("Время: " + calendar2.get(Calendar.HOUR) + ":");
//        System.out.print(calendar2.get(Calendar.MINUTE) + ":");
//        System.out.println(calendar2.get(Calendar.SECOND));
//
//        int year = calendar2.get(Calendar.YEAR);
//        System.out.print(year + " - ");
//        System.out.print(calendar2.isLeapYear(year) ? "високосный" : "не високосный");

//        Calendar date1 = new GregorianCalendar();
//        Calendar date2 = new GregorianCalendar();
//        date1.set(Calendar.YEAR, 2000);
//        int year1 = date1.get(Calendar.YEAR);
//        int year2 = date2.get(Calendar.YEAR);
//        System.out.println(year2 - year1);

//        Calendar calendar = new GregorianCalendar(2024, Calendar.FEBRUARY, 28);
////        calendar.add(Calendar.DAY_OF_MONTH, 2);
////        calendar.add(Calendar.DAY_OF_MONTH, -2);
//        calendar.roll(Calendar.MONTH, -2);
//        System.out.println(calendar.getTime());

//        Calendar calendar = new GregorianCalendar();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
//        System.out.println(dateFormat.format(calendar.getTime()));

        long start = System.currentTimeMillis();
//        System.out.println(start);

        for (int i = 0; i <= 1000; i++) {
            System.out.println("Случайное число: №" + i + ": " + (int) (Math.random() * 10));
        }

        long timeWorkProgram = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkProgram + " миллисекунд");
    }
}
