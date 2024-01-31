package lesson7;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//
//        System.out.print("На каком Вы этаже: ");
//        int n1 = input.nextInt();  // 5 4 3 2 1
//        elevator(n1);  // 0
//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(0, mas));
//        System.out.println(sumList(mas));

//        System.out.println(toStr(18, 8));
        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();  // 5
        int[] list = new int[size];  //  [0,0,0,0,0] => [2, 4, 5, 6, 8]

        int option;
        do {
            System.out.println("Меню:");
            System.out.println("1. Ввод элементов массива");
            System.out.println("2. Отображение массива");
            System.out.println("3. Поиск элемента в массиве");
            System.out.println("4. Сортировка массива");
            System.out.println("5. Выход");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    readArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("Введите элемент, который вы хотите найти: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);  // 3
                    if (index == -1) {
                        System.out.println("Элемент не найден");
                    } else {
                        System.out.println("Элемент найден на позиции " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Отсортированный массив:");
                    sortArray(list);
                    displayArray(list);
                    break;
            }
        } while (option != 5);
    }

    public static void readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int searchArray(int[] array, int data) {  // ([9, 5, 1, 7, 3], 7)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {  // 7 == 7
                return i;  // 3
            }
        }
        return -1;
    }

    public static void sortArray(int[] array){
        for (int i = 0; i < array.length - 1; i++){  // [8, 6, 7]  i = 2, i < 2  => [6, 8, 7] => [6, 7, 8]
            for (int j = 0; j < array.length - i - 1; j++){ // j = 1, j < 1
                if(array[j] > array[j + 1]){
                    int temp = array[j];  // 8
                    array[j] = array[j + 1];  // 7
                    array[j + 1] = temp;  // 8
                }
            }
        }
    }

//    public static String toStr(int n, int base) {  // (15, 16)
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
//        if (n < base) {  // 15 < 16
//            return convert[n];  // convert[15] = "F"
//        } else {
//            return toStr(n / base, base) + convert[n % base];  // convert[14] = "E"
//        }
//    }

//    public static int sumList(int i, int[] arr) {  // (i=4, []={1, 3, 5, 7, 9})
//        if (i == (arr.length - 1)){  // 4 == 4
//            return arr[i];  //  arr[i] = 9
//        }
//        return arr[i] + sumList(i + 1, arr); // arr[i] = 1 + 3 + 5 + 7
//    }

//    public static int sumList(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static void elevator(int n){
//        if(n == 0){
//            System.out.println("Вы в подвале");
//            return;
//        }
//        System.out.println("=> " + n);
//        elevator(n - 1);
//        System.out.print(n + " ");
//    }
}





