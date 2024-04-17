package lessons23;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Цикл 1, Итерация: " + i);
        }

        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Цикл 2, Итерация: " + i);
        }
    }
}
