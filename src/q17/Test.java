package q17;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException{
        var file = new File("C:\\A\\temp.dat");
        try(
                var os = new DataOutputStream(new FileOutputStream(file));
                var is = new DataInputStream(new FileInputStream(file))){
            os.writeChars("JAVA"); //it writes 4 characters as 8 bytes of data.
            System.out.println(is.readChar()); //returns 2 bytes of data, interpreted as char
        }
    }
}
