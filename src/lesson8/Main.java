package lesson8;

//import java.util.InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        try {
//            int[] numbers = new int[3];
//            numbers[4] = 9;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Введен некорректный индекс");
//        }


//        Scanner input = new Scanner(System.in);
//
//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e){
//            System.out.println("Вы ввели не целое число или делить на 0 нельзя");
//        } finally {
//            System.out.println("Конец программы");
//        }

//        catch (InputMismatchException e){
//            System.out.println("Вы ввели не целое число");
//        } catch (ArithmeticException e){
//            System.out.println("Делить на 0 нельзя");
//        }

        int res = getFactorial(-5);
        System.out.println(res);
    }

    public static int getFactorial(int num) {
        int res = 1;
        try {
            if (num < 1) {
                throw new Exception("Число меньше 1 указывать нельзя");
            }
            for (int i = 1; i <= num; i++) {  // 1 2 3 4 5
                res *= i;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            res = num;
        }
        return res;
    }
}
