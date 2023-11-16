package q13;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        var dir = new File("C:" + System.getProperty("path.separator") + "A");
        dir.mkdir();
    }
}
