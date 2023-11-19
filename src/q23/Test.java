package q23;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        try (var pw = new PrintWriter("C:\\A\\test.txt")){
            pw.close();
            pw.flush();//write(1); // nothing is written to the file.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
