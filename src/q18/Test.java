package q18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        try (var writer = new BufferedWriter( new FileWriter("C:\\A\\test.txt"))){
            writer.close();
            writer.newLine();
        }
    }
}
