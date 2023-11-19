package q25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        try(
                var fis = new FileInputStream("C:\\Users\\ahmed.elsayed\\Downloads\\documents\\family\\asiya\\assiya.jpg");
                var fos = new FileOutputStream("C:\\Users\\ahmed.elsayed\\Downloads\\documents\\family\\asiya\\assiya_copy_exact.jpg")
        ){
            int res;
            var arr = new byte[500000]; // all 500,0000 elements initialized to 0
            while ((res = fis.read(arr)) != -1){
//                fos.write(arr); // size = 500,000 even if source image is small
                fos.write(arr, 0, res); // same size of source image
            }
        }
    }
}
