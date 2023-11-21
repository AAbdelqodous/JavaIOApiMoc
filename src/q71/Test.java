package q71;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test {
    public static void main(String[] args) {
        try {
            new File("C:\\Users\\ahmed.elsayed\\Documents\\java\\Test\\t1.txt"); //doesn't create 't1.txt' file.
            // It just returns the File object containing abstract pathname.
            new FileWriter("C:\\Users\\ahmed.elsayed\\Documents\\java\\Test\\t2.txt");
            new PrintWriter("C:\\Users\\ahmed.elsayed\\Documents\\java\\Test\\t3.txt");
            new BufferedWriter(new FileWriter(new File("C:\\Users\\ahmed.elsayed\\Documents\\java\\Test\\t4.txt")));

            Files.newBufferedWriter(Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java", "Test", "t5.txt"));
            Files.newBufferedWriter(Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java", "Test", "t6.txt"),
                    StandardOpenOption.CREATE);
            Files.newBufferedWriter(Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java", "Test", "t7.txt"),
                    StandardOpenOption.CREATE_NEW);
            Files.newBufferedWriter(Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java", "Test", "t8.txt"),
                    StandardOpenOption.WRITE);//StandardOpenOption.WRITE or StandardOpenOption.APPEND or StandardOpenOption.TRUNCATE_EXISTING
            // opens the existing file, it doesn't create any new file. Line n8 throws NoSuchFileException.

        } catch (IOException e) {
//            throw new RuntimeException(e);
        }

        System.out.println(new File("C:\\Users\\ahmed.elsayed\\Documents\\java\\Test").listFiles().length);
    }
}
