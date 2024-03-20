package lessons17.sample;


interface Printable {
    //    void print(String s);
    void print();
}


public class Main {
    public static void main(String[] args) {
//        Printable printer = p -> System.out.println(p);
//        printer.print("Hello, Java!");
        Printable printer = () -> {
            System.out.println("Hello, Java!");
            System.out.println("Вторая строка");
        };
        printer.print();
    }
}

