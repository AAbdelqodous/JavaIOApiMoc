package q67;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        var src = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\C\\Book.java");
        var tgt = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\Book.java");
        var copy = Files.copy(src, tgt);
        System.out.println(copy);

        System.out.println(Files.isSameFile(src, copy));
        System.out.println(Files.isSameFile(tgt, copy));
    }
}
