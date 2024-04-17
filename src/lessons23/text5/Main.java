package lessons23.text5;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Concurrency());

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e){
                System.out.println("Я не мог дождаться, меня прервали: " + e);
            }

            for (int i = 1; i <= 5; i++) {
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                System.out.println("Поток 2, Итерация: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Concurrency implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Поток 1, Итерация: " + i);
        }
    }
}

