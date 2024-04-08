package lesson21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes5.txt")){
            String text = "Hello, ";
            writer.write(text);
            writer.append('\n');
            writer.append("Java!");
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("notes5.txt")){
            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char) c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
