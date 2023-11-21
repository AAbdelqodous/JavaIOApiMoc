package q75;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) throws IOException {
        var root = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java");
        BiPredicate<Path, BasicFileAttributes> predicate = (p, a) -> p.endsWith("txt"); //toString().endsWith("txt");
        try (var paths = Files.find(root, 2, predicate)){
            paths.forEach(System.out::println);
        }
    }
}
