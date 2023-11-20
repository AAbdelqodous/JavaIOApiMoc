package q62;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B");
        System.out.println(Files.isDirectory(path));
        System.out.println(path.toFile().isDirectory());
        System.out.println(Files.getAttribute(path, "isDirectory"));
    }
}
