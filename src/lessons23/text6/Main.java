package lessons23.text6;

public class Main {
    public static void main(String[] args) {
        Messenger sender = new Messenger();

        ThreadMessenger thread1 = new ThreadMessenger("Hello", sender);
        thread1.setName("Поток 1");

        ThreadMessenger thread2 = new ThreadMessenger("Bye", sender);
        thread2.setName("Поток 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Поток прерван: " + e);
        }
    }
}

class Messenger {
    public void sendMessage(String msg) {  // synchronized
        System.out.println(Thread.currentThread().getName() + ", Отправка сообщения: " + msg);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван: " + e);
        }

        System.out.println(Thread.currentThread().getName() + ", Сообщение отправлено: " + msg);
    }
}

class ThreadMessenger extends Thread {
    private String msg;
    Messenger sender;

    public ThreadMessenger(String msg, Messenger sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {
            this.sender.sendMessage(this.msg);
        }
    }
}