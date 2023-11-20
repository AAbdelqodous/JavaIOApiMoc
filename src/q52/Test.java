package q52;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) throws IOException {
        var src = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\X\\Y");
        var trgt = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\Y");
        Files.move(src, trgt, StandardCopyOption.REPLACE_EXISTING);
    }
}
