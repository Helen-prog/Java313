package lesson21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("notes.txt");
             FileOutputStream fos = new FileOutputStream("notes_new.txt")){
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }


//        String text = "Hello world!";
//        try (FileOutputStream fos = new FileOutputStream("notes.txt")){  // true - дозапись в файл
////        try (FileOutputStream fos = new FileOutputStream("D:\\Java313\\notes.txt")){
//            byte[] buffer = text.getBytes();
//            fos.write(buffer, 0, buffer.length);
//        } catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Файл был записан");

//        try (FileInputStream fis = new FileInputStream("notes.txt")){
//            System.out.printf("Размер файла: %d байт %n", fis.available());  // размер файла
//            int i;
//            while ((i = fis.read()) != -1){
//                System.out.print((char) i);
//            }
//        } catch (IOException ex){
//            System.out.println("Ошибка: " + ex.getMessage());
//        }
    }
}
