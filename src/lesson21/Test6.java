package lesson21;

import java.io.*;
import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Persons> people = new ArrayList<>();
        people.add(new Persons("Александр", 37, 187, true));
        people.add(new Persons("Михаил", 30, 175, false));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(people);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Persons> newPeople = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            newPeople = (ArrayList<Persons>) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (Persons p1 : newPeople) {
            System.out.printf("Name: %s \t Age: %d %n", p1.getName(), p1.getAge());
        }
    }
}

class Persons implements Serializable {
    private String name;
    private transient int age;
    private double height;
    private boolean married;

    public Persons(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}
