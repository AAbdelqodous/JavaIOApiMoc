package q70;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        var src = Paths.get("C:\\Users\\ahmed.elsayed\\Documents\\java\\A\\B\\Book.java");

        try (var br = Files.newBufferedReader(src)){

            String data;
            while ((data = br.readLine()) != null){
                System.out.println(data);
            }
        }
    }
}
