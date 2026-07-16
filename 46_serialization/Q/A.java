import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        
        Student st1 = new Student("Sambhav", 18);
        
        st1.maxAge = 23;
        
        try {
            FileOutputStream fos = new FileOutputStream("r1.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st1);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
