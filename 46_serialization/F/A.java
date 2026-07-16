import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class A {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "vigyan";
        s.age = 21;
        s.college = "SRIT";

        s.degree = "BTech";
        s.branch = "CSE";
        s.semester = 3;

        try {
            new ObjectOutputStream(new FileOutputStream("info.txt")).writeObject(s);            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}