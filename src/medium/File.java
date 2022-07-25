package medium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        FileReader fr;
        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Education\\h13.txt"))) {
            String line;
            while ((line = bf.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
