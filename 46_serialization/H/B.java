import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

class B {
    public static void main(String[] args) {
        try {
            Student student = (Student)(new ObjectInputStream(new FileInputStream("info.txt")).readObject());
        
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.college);

            System.out.println(student.degree);
            System.out.println(student.branch);
            System.out.println(student.semester);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
