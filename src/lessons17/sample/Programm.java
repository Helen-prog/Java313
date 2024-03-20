package lessons17.sample;

public class Programm {
    public static void main(String[] args) {
        String text = "Лямбда выражение";
        System.out.println("Исходная строка: " + text);
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("Кол-во слов: " + ctr);

        text = "Программа, которая подсчитывает количество букв в предложении";
        wordCounter = s -> s.split("о+").length - 1;
        System.out.println("\nИсходная строка: " + text);
        ctr = wordCounter.countWords(text);
        System.out.println("Кол-во слов: " + ctr);
    }
}

interface WordCounter{
    int countWords(String tx);
}