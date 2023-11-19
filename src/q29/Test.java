package q29;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var stud = new Student("John", 20);
        try (
                var fos = new FileOutputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\Student.dat");
                var oos = new ObjectOutputStream(fos)
        ){
            oos.writeObject(stud);
        }

        try (
                var fis = new FileInputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\Student.dat");
                var ois = new ObjectInputStream(fis)
        ){
            var student = (Student) ois.readObject();
            System.out.printf("%s : %d", student.getName(), student.getAge());
        }
    }
}
