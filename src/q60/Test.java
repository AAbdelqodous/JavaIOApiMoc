package q60;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get(".", "..", ".", "..", "..", ".").normalize();
        System.out.println(path);

        System.out.println(path.getNameCount());
        System.out.println(path.getName(0));

        System.out.println(path.getName(0).toString().length());
    }
}
