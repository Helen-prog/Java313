package lesson11;

public class Program {
    public static void main(String[] args) {
//        Person p1 = new Person();  // создали объект (экземпляр класса)
//        p1.displayInfo();
//
////        p1.name = "Виктор";
////        p1.age = 28;
////        p1.displayInfo();
//
//        Person p2 = new Person("Игорь");
//        p2.displayInfo();

        Person p3 = new Person("Валентин", 625);
        p3.setName("Николай");
//        p3.setAge(628);
        System.out.println(p3.getAge());
        System.out.println(p3.getName());
//        p3.age = 1128;
        p3.displayInfo();
//
//        Person p4 = new Person(30);
//        p4.displayInfo();
    }
}

class Person{
    private String name;
    private int age;

    // инициализатор
//    {
//        name = "Первоначальное значение";
//        age = 100;
//    }
//
    // конструкторы
    public Person(){
        this.name = "неизвестно";
        this.age = 18;
    }
//    public Person(){}

    public Person(String name){
        this.name = name;
    }

//    public Person(int a){
//        age = a;
//    }
//
    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){  // геттер для получения доступа к возрасту (get - получить)
        return age;
    }

    public void setAge(int age){  // сеттер для установки нового значения возраста (set - установить)
        if (age > 0 && age < 110) {
            this.age = age;
        }
    }

    void displayInfo(){
        System.out.printf("Name: %s%nAge: %d%n", this.name, this.age);
    }
}
