package lesson11;

public class Sample {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик");
        Dog d2 = new Dog("Найда");
        d1.run();
        d2.run();
    }
}

class Dog{
    private String name;
    private Foot foot;

    public Dog(String name) {
        this.name = name;
        this.foot = new Foot();
        System.out.println("Экземпляр класса foot");
    }

    void run(){
        foot.run();
    }

    class Foot{

        void run(){
            String name = "Foot";
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }
}