import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "vikram singhania";
        student.age = 18;
        student.marks = 75.45f;
        
        try {
            FileOutputStream fos = new FileOutputStream("bheem.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }        
    }
}