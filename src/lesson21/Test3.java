package lesson21;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        Person per = new Person("Сергей", "Федоров", 35, 1.86, false);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))){
            dos.writeUTF(per.name);  // записывает в поток строку в кодировке UTF-8
            dos.writeUTF(per.surname);  // записывает в поток строку в кодировке UTF-8
            dos.writeInt(per.age);  // записывает в поток целочисленное значение int
            dos.writeDouble(per.height);  // записывает в поток значение double
            dos.writeBoolean(per.married);  // записывает в поток булево значение
            System.out.println("Файл был записан");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))){
            String name = dis.readUTF();
            String surname = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, Рост: %.2f, Женат: %b", name, surname, age, height, married);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

class Person{
    public String name;
    public String surname;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, String surname, int age, double height, boolean married) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}
