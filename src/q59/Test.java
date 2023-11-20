package q59;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get("A", "..", "B", "..").normalize();
        System.out.println(path); // returns 'Path[""]', which represents an empty path.
        System.out.println(path.getNameCount()); // For the empty path, `path.getNameCount()` returns 1
        System.out.println(path.getName(0).toString().length()); // return 0
    }
}
