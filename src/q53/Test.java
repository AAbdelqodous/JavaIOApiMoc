package q53;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get("F:\\A\\.\\B\\C\\D\\..\\Book.java");
        path.normalize();
        System.out.println(path); //Path interface are immutable, hence path.normalize() method doesn't make any changes to the Path object
        System.out.println(path.normalize());
    }
}
