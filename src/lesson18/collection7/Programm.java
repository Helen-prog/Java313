package lesson18.collection7;

import java.util.TreeSet;
import java.util.Iterator;

public class Programm {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Виктор", 5);
        Student st2 = new Student("Гермар", 3);
        Student st3 = new Student("Ольга", 1);
        Student st4 = new Student("Ирина", 4);
        Student st5 = new Student("Михаил", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        Student st6 = new Student("Алена", 3);
//        System.out.println(treeSet.headSet(st6));  // вернет TreeSet, с элементами которые меньше указанного
//        System.out.println(treeSet.tailSet(st6));  // вернет TreeSet, с элементами которые больше или равны указанному
//        Student st7 = new Student("Игорь", 2);
//        Student st8 = new Student("Владимир", 4);
//        System.out.println(treeSet.subSet(st7, st8));  // вернет TreeSet, с элементами начальной позиции до конечной (не включительно)
        System.out.println("=========================================");
        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================================");
        Iterator<Student> iterator2 = treeSet.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(name='" + name + "', course=" + course + ")";
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
