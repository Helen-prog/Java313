package lessons16;

public class Sample2 {
    public static void main(String[] args) {
        try {
            String text = "PHP";
//            String text = "Java";
            System.out.println("Исходная строка: " + text);
            checkVowels(text);
        } catch (NoVowelsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouyAEIOUY";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
                break;
            }
        }
        if (!containsVowels) {
            throw new NoVowelsException("Строка не содержит гласные буквы");
        } else {
            System.out.println("Строка содержит гласные буквы");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
