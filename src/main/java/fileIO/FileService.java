package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileService {
    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);
        // pobieram zawartość pliku dopóki występuje kolejny wiersz
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    public void readCsvFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);
        // pobieram zawartość pliku dopóki występuje kolejny wiersz
        int i = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            i++;
            // pominięcie nagłówka
            if (i == 1) {
                continue;
            }
            // podziel zawartość po separatorze ;
            String elements[] = line.split(";");
            System.out.println("ID: " + elements[0]);
            System.out.println("NAME: " + elements[1]);
            System.out.println("LASTNAME: " + elements[2]);
            System.out.println("=================================");

        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        FileService fs = new FileService();
        fs.readFile("/Users/catalina/Desktop/projects/java/src/main/java/fileIO/text.txt");
        fs.readCsvFile("/Users/catalina/Desktop/projects/java/src/main/java/fileIO/data.csv");
    }
}
