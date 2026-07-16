import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A1 {
    public static void main(String[] args) {
        
        Student st1 = new Student("Prabal", 20);
        
        st1.maxAge = 25;
        
        try {
            FileOutputStream fos = new FileOutputStream("r2.txt");

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
