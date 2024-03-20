package lessons17.sample2;

public class Main {
    public static void main(String[] args) {
        String inStr = "Лямбда выражение в Java";
        System.out.println("Исходная строка: " + inStr);
//        String outStr = stringOp(str -> str.toUpperCase(), inStr);
//        System.out.println("Строка в верхнем регистре: " + outStr);
//
//        outStr = stringOp(str -> {
//            String res = "";  // res = "Лямбдав"
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) != ' ') {
//                    res += str.charAt(i);
//                }
//            }
//            return res;
//        }, inStr);
//        System.out.println("Строка с удаленными пробелами: " + outStr);

//        outStr = stringOp(str -> {
//            String res = "";
//            return res;
//        }, inStr);
//        System.out.println("Перевернутая строка: " + outStr);
        String outStr = stringOp(inStr, str -> {
            String res = "";
            for (int i = (str.length() - 1); i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        });
        System.out.println("Перевернутая строка: " + outStr);
    }

    static String stringOp(String a, StringFunc sf) {
        return sf.func(a);
    }
}

interface StringFunc {
    String func(String n);
}
