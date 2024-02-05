package lesson10;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.  198765 Ели[-ели]";
//        String pattern = "[а-я&&[^к-н]]";  // [^...] - все кроме заданных символов
        // [а-д[к-н]] - объединение символов  => [а-дк-н]
        // [а-я&&[к-н]] - пересечение символов => [к-н]
        // [а-я&&[^к-н]] - вычитание символов (все кроме [к-н])
//        String pattern = "[А-яЁё\\]\\[-]";  // [А-Яа-яЁё]  [A-Za-z]  . - один любой символ
//        String pattern = "[12][0-9][0-9][0-9]";  // [0-9] - диапазон символов
//        String pattern = "[5-9]";  // [0-9] - диапазон символов
//        String pattern = "[204]";  // [...] - один символ из перечисленных
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//////            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
//////            System.out.println(s.substring(matcher.start(), matcher.end()));
//            System.out.println(matcher.group());
//        }
//        String str = "ЁАЯаяё";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
//        }
//        char a = 993;
//        System.out.println(a);

//        try {
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т23:00";
//            String pattern = "[0-2][0-9]:[0-5][0-9]";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        } catch (PatternSyntaxException pse){
//            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
//            System.err.println("Описание: " + pse.getDescription());
//            System.err.println("Позиция: " + pse.getIndex());
//            System.err.println("Неправильный шаблон: " + pse.getPattern());
//        }
        // String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]. Hello_World 2000000000000";
//        String s = "Цифры: 7, +17, --42, 0013, 0.3";
//        String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1830";
//        String pattern = "\\w+\\s*=\\s*[^;]+";   // \w+\s*=\s*[А-я0-9\s.]+
//        String pattern = "[+-]?[\\d.]+";
        //  + - от 1 до бесконечности  (\d+)
        //  * - от 0 до бесконечности
        //  ? - от 0 до 1
        // \\d == [0-9] - одна любая цифра  \\D == [^0-9]
        // \\s == [ ] - один пробельный символ  \\S == [^ ]
        // \\w == [A-Za-z0-9_] - один символ - буквы (только англ., регистронезависимый), цифры и символ подчеркивания \\W == [^A-Za-z0-9_]
        // \\A - поиск шаблона от начала строки
        // \\Z - поиск шаблона в конце строки
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }


//        String s = "12 сентября 2024 года 23456";
//        String pattern = "\\d{2,4}";
//        // {4} - 4 повторения
//        // {2,} - от 2 повторений до бесконечности
//        // {2,4} - от 2 повторений до 4 (включительно)
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
//        String pattern = "\\+?7\\d{10}";

//        String s = "I learning Java!!!";
////        String pattern = "^\\w+\\s\\w+";
//        String pattern = "^\\w+\\s\\w+\\s\\w+$";
////      ^ - строка должна начинаться с заданного шаблона
////      $ - строка должна заканчиваться на заданный шаблон
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Java_master00-9";
//        String pattern = "^[\\w-]{3,16}$";  // буквы, цифры, _, -, от 3 до 16
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());

//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. Hello_World";
//        String pattern = "я";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите текст с цифрами: ");
//        String s = input.nextLine();
//        String pattern = "\\d #поиск цифр";
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Matcher matcher = regex.matcher(s);
//        int count = 0;
//        while (matcher.find()){
//            count++;
//        }
//        System.out.println("Количество цифр во введенном тексте: " + count);

//        String s = "one\ntwo";
////        String pattern = "one.\\w+";
//        String pattern = "one$";
////        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Goods - $500";
//        String pattern = "$500";
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "Java,\njava,\nJAVA";
//        String pattern = "(?mi)^java";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
//        String pattern = "[а-я\\w.-]+@[\\w.]+.ru";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }

//        String s = "12 сентября 2024 года 2345668";
//        String pattern = "\\d{2,4}?";

//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.*?>";

//        String s = "Егорова Алиса Александровна";
//        String pattern = "А.+?а";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        String s = "Word2016, PS6, AI5";
//        String pattern = "([a-z]+)(\\d*)";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        }

//        String s = "abc";
//        String pattern = "(.(.(.)))";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        matcher.find();
//        System.out.println(matcher.groupCount());  // 3
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));
//        }

//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Петр|Ольга|Виталий";
//        String s = "int = 4, float = 4.0f, double = 8.0";
////        String pattern = "\\w+\\s*=\\s*\\d[.\\w]*";
////        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*";
////        String pattern = "(int|float)\\s*=\\s*\\d[.\\w]*";
//        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
////            System.out.println(matcher.group());
////            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        }

//        String s = "127.0.0.1";
//        String s = "127.168.255.255";
////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        String s = "23-10-2024";
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
//        String[] arr = s.split("[.2]");
//        for (String temp : arr) {
//            System.out.println(temp);
//        }

//        Pattern p = Pattern.compile(",\\s");
//        String[] arr = p.split("Суворова Виктория, Россия, г. Сочи, +7 999 555-77-33");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        String s = "05-03-1987 // Дата рождения";
////        String s2 = s.replaceAll("\\s*//.*", "");
////        System.out.println("Дата рождения: " + s2);  // Дата рождения: 05-03-1987
//        String s2 = s.replaceAll("\\s*//.*", "").replaceAll("-", ".");
//        System.out.println("Дата рождения: " + s2);  // Дата рождения: 05.03.1987

        // Побитовые операторы

//        // Побитовое И
//        System.out.println(0b111 & 0b000);  // 7 & 0  => 0
//        System.out.println(0b111 & 0b001);  // 7 & 1  => 1
//        System.out.println(0b111 & 0b010);  // 7 & 2  => 2
//
//        System.out.println(7 & 0);
//        System.out.println(7 & 1);
//        System.out.println(7 & 2);

        // Побитовое ИЛИ
//        System.out.println(0b101 | 0b010);  // 5 & 2  (0b111)   => 7
//        System.out.println(0b011 | 0b100);  // 3 & 4  (0b111)   => 7
//        System.out.println(0b010 | 0b100);  // 2 & 4  (0b110)   => 6

        // Исключающее побитовое ИЛИ
//        System.out.println(0b110 ^ 0b101);  // 6 & 5 (0b011)   => 3
//        System.out.println(0b101 ^ 0b010);  // 5 & 2  (0b111)   => 7
//        System.out.println(0b100 ^ 0b111);  // 4 & 7  (0b011)   => 3

        // Побитовое НЕ
//        System.out.println(~0b0);
//        System.out.println(~0b1);
//        System.out.println(~0);
//        System.out.println(~1);
//        System.out.println(0b11111111111111111111111111111110);

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int number = input.nextInt();
//        if((number & 1) == 0){  // number % 2 == 0
//            System.out.println(number + " - четное число");
//        }
//        if((number & 1) == 1){  // number % 2 == 1
//            System.out.println(number + " - нечетное число");
//        }

//        int x = 1;
//        double y = 3.1515d;
////        x = (int)(x + y);
////        x = x + (int)y;
//        x += y;
//        System.out.println(x);

//        int x = 5, y = 7;
//        System.out.println("x = " + x + ", y = " + y);
//
////        x = x ^ y;  // x == 2   // 101 ^ 111 = 010
////        y = x ^ y;  // y == 5   // 010 ^ 111 = 101
////        x = x ^ y;  // x == 7   // 010 ^ 101 = 111
//
//        y ^= (x ^= y);
//        x ^= y;
//        System.out.println(x);
//        System.out.println("x = " + x + ", y = " + y);

//        System.out.println(0b101 >> 1);
//        System.out.println(5 >> 2);

//        System.out.println("Вносим изменения");

//        System.out.println("Проверка изменений на GitHub");

        System.out.println("Вносим изменения на другом компьютере");
    }
}
