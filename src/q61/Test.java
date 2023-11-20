package q61;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get("F:", "..", ".", "..").normalize();
        System.out.println(path);
        System.out.println(path.getNameCount()); //Root folder or drive is not considered in count and indexing.
        System.out.println(path.getName(0)); // it need path.getNameCount() to give at least 1 to return a value
        System.out.println(path.getNameCount() + ":" + path.getName(0).toString().length());
    }
}
