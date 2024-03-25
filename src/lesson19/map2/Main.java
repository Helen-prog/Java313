package lesson19.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Виктор", "Борисов", 2);
        Student st2 = new Student("Анна", "Полякова", 3);
        Student st3 = new Student("Ирина", "Ренатова", 1);
        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 8.6);
        map.put(st2, 7.9);
        map.put(st3, 9.3);
        System.out.println(map);
        Student st4 = new Student("Виктор", "Борисов", 2);
//        boolean res = map.containsKey(st4);
//        System.out.println("res = " + res);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        for (Student student : map.keySet()) {
            System.out.println(student);
        }
        System.out.println();
        for (Double value : map.values()) {
            System.out.println(value);
        }
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(name='" + name + "', surname='" + surname + "', course=" + course + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
//    @Override
//    public int hashCode() {
//        return name.length() + surname.length() + course;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }
}
