package lessons17.sample;

public class Program {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {
//        int x = 10;  // final int x = 10;
//        int y = 20;

//        Calc operation = () -> {
//            x = 30;
//            return x + y;
//        };
//
//        System.out.println(x);
//        System.out.println(operation.calculate());

//        Calc operation = (x, y) -> {
//            if(y == 0){
//                return 0;
//            } else{
//                return (double)x / y;
//            }
//        };
//        System.out.println(operation.calculate(20, 10));
//        System.out.println(operation.calculate(3, 2));
        Calc<Integer> operation1 = (x, y) -> x + y;
        Calc<String> operation2 = (x, y) -> x + y;
        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("Hello", "World"));
    }
}

interface Calc<T> {
    T calculate(T x, T y);
}

//interface Calc {
//    double calculate(int x, int y);
//}

//interface Calc {
//    int calculate();
//}
