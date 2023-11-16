package q15;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        var dir = new File("F:" + File.separator + "A" + File.separator + "B");
        System.out.println(dir);
        System.out.println(dir.getParentFile().getParentFile());
        System.out.println(dir.getParentFile().getParent());
//        System.out.println(dir.getParent().getParentFile());
//        System.out.println(dir.getParent().getParent());
    }
}
