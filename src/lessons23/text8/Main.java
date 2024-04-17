package lessons23.text8;

public class Main {
    public static void main(String[] args) {

//        int i = 10;
//        int j = 12;
//        i += ++j;  // i = i + ++j;  // i = 10 + 13
//        System.out.println(i);

//        int i = 10, j = 12, k = 1;
//        k += i++ - --j;  // k = k + i++ - --j  // 1 + (10++ - --12)
//                                               // 1 + (10 - 11)   // 1 + (-1)
//         System.out.println(k);
//        A var = new B();
//        var.print();
    }
//    public static void main(String[] args) {
//        Store store = new Store();
//        Thread producer = new Thread(new Producer(store));
//        Thread consumer = new Thread(new Consumer(store));
//        producer.start();
//        consumer.start();
//    }
}

//class A {
//    static public void print(){
//        System.out.println("A.print()");
//    }
//}
//
//class B extends A {
//    static public void print(){
//        System.out.println("B.print()");
//    }
//}

//class Store {
//    private int product = 0;
//
//    public synchronized void get(){
//        while (product < 1){
//            try{
//                wait();
//            } catch (InterruptedException e){
//                System.out.println("Поток прерван: " + e);
//            }
//        }
//        product--;
//        System.out.println("Покупатель купил 1 товар");
//        System.out.println("Товаров на складе: " + product);
//        notify();
//    }
//
//    public synchronized void put(){
//        while (product >= 3){
//            try{
//                wait();
//            } catch (InterruptedException e){
//                System.out.println("Поток прерван: " + e);
//            }
//        }
//        product++;
//        System.out.println("Производитель добавил 1 товар");
//        System.out.println("Товаров на складе: " + product);
//        notify();
//    }
//}
//
//class Producer implements Runnable{
//    Store store;
//
//    public Producer(Store store) {
//        this.store = store;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i < 6; i++) {
//            store.put();
//        }
//    }
//}
//
//class Consumer implements Runnable{
//    Store store;
//
//    public Consumer(Store store) {
//        this.store = store;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i < 6; i++) {
//            store.get();
//        }
//    }
//}