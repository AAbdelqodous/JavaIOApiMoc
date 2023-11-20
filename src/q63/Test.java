package q63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Test {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\C\\Book.java");
        System.out.println(Files.getAttribute(path, "creationTime"));
        System.out.println(Files.readAttributes(path, "*").get("creationTime"));
        System.out.println(Files.readAttributes(path, BasicFileAttributes.class).creationTime());
    }
}
