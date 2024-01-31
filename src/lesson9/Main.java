package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Work";
//        String message = str1 + " " + str2;
//        System.out.println(message);
//
//        char[] helloArray = {'П', 'р', 'и', 'в', 'e', 'т', '.'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//
//        String str = "2";
//        int a = 5;
//        String newStr = a + str;
//        System.out.println(newStr);  // "25"
//
//        int b = 3;
//        String st = b + "";
//        System.out.println(st);

//        String str = "2";
//        int a = Integer.parseInt(str);
//        System.out.println(a);
//
//        int b = Integer.parseInt("789");
//        System.out.println(b);

//        String name = "Hello";
//        int count = (name + 57).length();  // длина строки
//        System.out.println(count);  // "Hello57"  => 7
//
//        int count1 = "".length();
//        System.out.println(count1);  // 0

//        String name = "Nikita";
//        String name2 = name.toLowerCase();  // преобразование символов в строке в нижний регистр
//        String name2 = name.toUpperCase();  // преобразование символов в строке в верхний регистр
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
//        char res = name.charAt(2);  // возвращает символ, расположенный по указанному индексу строки
//        System.out.println(res);
//        String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длины, " +
//                "и будем хранить в соответствующих позициях количество вхождений символов.";
////        String text = "Привет";
//        System.out.println(text);
//        text = text.toLowerCase();
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }

//        String s1 = "";
//        if(s1.isEmpty()){  // s1.length() == 0  // проверка, что строка пустая
//            System.out.println("Пустая строка");
//        }

//        String str = "ABC";
//        char[] res = str.toCharArray();  // преобразование строки в массив символов
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите адрес сайта: ");
//        String path = input.nextLine();
//
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == '/'){
//                chars[i] = '\\';
//            }
//        }
//
//        String res = new String(chars);
//        System.out.println(res);

//        String str = "I learning Java";
//        System.out.println(str);
//        System.out.println(str.indexOf('a'));  // ищет первое вхождение символа или подстроки и возвращает -1, если совпадение не найдено
////        System.out.println(str.indexOf("Java1"));
//        System.out.println(str.indexOf('a', 5));
//        System.out.println(str.lastIndexOf('a'));
//        System.out.println("   Hello Word       ");
//        System.out.println("   Hello Word       ".trim());  // удаляет пробельные символы с начала и конца строки

//        String str = "I Java learning Java program";
////        System.out.println(str.substring(2));  // получение получение подстроки из строки
////        System.out.println(str.substring(2, 12));
//        String[] words = str.split(" Java ");
//        for (String word : words) {
//            System.out.println(word);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите ФИО: ");
//        String name = input.nextLine();  // Никонов Валерий Анатольевич
//        String[] res = name.split(" ");  // ["Никонов", "Валерий", "Анатольевич"]
//        System.out.println(res[0] + " " + res[1].charAt(0) + "." + res[2].charAt(0) + ".");

//        String res = String.join(":", "00", "23", "30");
//        System.out.println(res);
//
//        String[] text = new String[]{"Hello", "World"};
//        String str = String.join(" ", text);
//        System.out.println(str);

//        String text = "Я изучаю С++. Мне нравится С++.";
//        System.out.println(text);
//        String[] array = text.split("С\\+\\+");
//        String res = String.join("Java", array);
//        System.out.println(res);
//        String tx = text.replace("С++", "Java");
//        System.out.println(tx);

//        int[] arr = {-2, 3, 8, -11, -4, 6, -7, -9};
//        System.out.println("n = " + Calc(arr, 0));

//        String str = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
//        System.out.println(str);
//        String a = str.substring(0, str.indexOf("о") + 1);
//        String b = str.substring(str.indexOf("о") + 1, str.lastIndexOf("о"));
////        System.out.println(str.lastIndexOf("о"));
//        String c = str.substring(str.lastIndexOf("о"));
//        System.out.println(a + b.replace("о", "О") + c);

//        String s1 = "Hello";
//        String s2 = "Hello1";
//        String s3 = "HELLO";
//        System.out.println(s1.equals(s2));  // сравнение строк на равенство
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3)); // сравнение строк на равенство (регистронезависимое)
//        System.out.println("I learning Java".endsWith("Java"));  // заканчивается ли строка заданной подстрокой
//        System.out.println("I learning Java".startsWith("I"));  // начинается ли строка на заданную подстроку
//        System.out.println("I learning Java".contains("ing"));  // содержит ли строка заданную подстроку

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//
//        if(path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png") ){
//            System.out.println("Это изображение");
//        } else if (path.endsWith(".docx") || path.endsWith(".doc")){
//            System.out.println("Это документ Word");
//        } else{
//            System.out.println("Неизвестный формат");
//        }
//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(5);  // код символа по его индексу в строке
//        System.out.println(n);
//
//        n = s.codePointBefore(5);  // код символа, который идет перед указанным индексом
//        System.out.println(n);

//        String s;
//
////        double d = 3.8567;
////        int d = -3902;
////        char d = '+';
//        boolean d = true;
//        s = String.valueOf(d);  // переводит значение числового или строкового типа в его строковое представление
//        System.out.println(s);
//        String str = "A";  // 49
//        System.out.println("A > m : " + str.compareToIgnoreCase("m"));  // -1  // Лексикографическое сравнение двух строк
//        str = "m";  // 50
//        System.out.println("m > a : " + str.compareToIgnoreCase("A"));  // 1
//        System.out.println("m == m : " + str.compareTo("m"));  // 0

        StringBuilder sb = new StringBuilder();
//        sb.append('a');
//        sb.append(10);
//        sb.append(123456L);
//        sb.append(12.34);
//        sb.append(12.34f);
//        sb.append("Hello")
//                .append("_")
//                .append("World");
//        System.out.println(sb);
//        sb.insert(5, "_!");
//        System.out.println(sb);
//        sb.delete(5, 7);
//        System.out.println(sb);
//        sb.replace(5, 10, "Java");
//        System.out.println(sb);
//        String st = sb.substring(5);
//        System.out.println(st);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l"));
//        System.out.println(sb.indexOf("l", 7));
//        StringBuilder sb1 = createStr(5, 3);
//        modifyStr(sb1, "=", "равно");
//        modifyStr(sb1, "+", "плюс");
//        modifyStr(sb1, "-", "минус");
//        modifyStr(sb1, "*", "умножить");
//        System.out.println(sb1);

        StringBuilder modStr = getStringBuilder();
        System.out.println("Измененная строка - \"" + modStr + "\"");
    }

    public static StringBuilder getStringBuilder(){
        System.out.print("Исходная строка = \"");
        String str = "  Текст  с    повторяющимися  символами ";
        System.out.println(str + "\"");
        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
        for (int i = 0; i < modify.length(); i++) {
            for (int j = modify.length() - 1; j > i ; j--) {
                if (modify.charAt(i) == modify.charAt(j)){
                    modify.deleteCharAt(j);
                }
            }
        }
        return modify;
    }

//    public static StringBuilder createStr(int a, int b){
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
//        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
//        return res;
//    }
//
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr){
//        int pos;
//        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//        return stBuild;
//    }

//    public static int Calc(int[] numbers, int index){  // {-2, 3, 8, -11, -4, 6}, index = 6
//        if(index == numbers.length){
//            return 0;  // 0
//        }
//        return (numbers[index] < 0 ? 1 : 0) + Calc(numbers, index + 1);  // 1 + 0 + 0 + 1 + 1 + 0
//    }
}
