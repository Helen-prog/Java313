package lessons23.text3;

public class Main {
    public static void main(String[] args) {
        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);

        thread1.start();
        thread2.start();
    }
}

class Concurrency implements Runnable{
    private int num;
    private Thread t;

    public Concurrency(int num) {
        this.num = num;
    }

    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
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