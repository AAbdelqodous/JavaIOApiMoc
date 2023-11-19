package q19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        var bw = new BufferedWriter(new FileWriter("C:\\A\\temp.tmp"));
        try (var writer = bw){

        }finally {
            bw.flush();
        }
    }
}
