package lessons23.text2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Concurrency(1));
        Thread thread2 = new Thread(new Concurrency(2));

        thread1.start();
        thread2.start();
    }
}

class Concurrency implements Runnable{
    private int num;

    public Concurrency(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Цикл " + this.num + ", Итерация: " + i);
        }
    }
}
