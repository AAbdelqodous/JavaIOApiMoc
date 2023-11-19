package q24;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        var bos = new BufferedOutputStream(
                new FileOutputStream("C:\\A\\file.tmp"));
        bos.write(2);
        bos.close();
    }
}
