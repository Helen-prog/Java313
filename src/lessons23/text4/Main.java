package lessons23.text4;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
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
        });

        Thread thread2 = new Thread(() -> {
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
