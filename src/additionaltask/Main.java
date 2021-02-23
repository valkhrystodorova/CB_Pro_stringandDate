package additionaltask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/additionaltask/additional.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String tmp;
            while ((tmp = reader.readLine()) != null){
                System.out.println(tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
