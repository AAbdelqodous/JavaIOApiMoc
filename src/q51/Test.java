package q51;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\Book.java");
        var pSize = Files.size(path);

        var file = new File("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\Book.java");
        var fSize = file.length();
        System.out.println(pSize == fSize);
    }
}
