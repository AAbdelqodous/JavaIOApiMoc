package q12;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        var dirs = new File("C:\\A\\B\\C");
        System.out.println(dirs.mkdirs());
        var dir = new File("C:\\A");
        System.out.println(dir.mkdir());
        System.out.println(dir.delete());
    }
}
