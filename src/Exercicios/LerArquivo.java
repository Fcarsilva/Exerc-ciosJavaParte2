package Exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {

       File file = new File("C:\\Users\\Fabio\\Documents\\cursonelio.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.print("Error:" + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
