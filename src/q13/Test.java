package q13;

import java.io.File;

public class Test {
    public static void main(String[] args) {
//        var dir = new File("C:" + System.getProperty("path.separator") + "A"); // C:;A ;

        var dir = new File("C:" + System.getProperty("file.separator") + "X"
                + System.getProperty("file.separator") + "Y");
        System.out.println(dir.getParentFile());
        System.out.println(dir.getParentFile().getParent());
    }
}
