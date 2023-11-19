package q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        try(var br = new BufferedReader( new InputStreamReader(System.in))){
            System.out.println("Enter a number between 1 and 10: ");
            var num = br.read(); // return a single character => user input is '2' => ASCII is 50 not 2
            System.out.println(num);
        }
    }
}
