package lesson18.collection9;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red");  // конец очереди
        states.addFirst("blue");  // начало очереди
        states.push("white");  // начало очереди
        states.addLast("green");  // конец очереди
        states.add("black");  // конец очереди
        System.out.println(states);

        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());

        while (states.peek() != null){
            System.out.println(states.pop());
        }
        System.out.println(states);
    }
}
