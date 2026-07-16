import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A1 {
    public static void main(String[] args) {
        Shape1 shape = new Shape1(45, 67, 12);
        
        try {
            FileOutputStream fos = new FileOutputStream("info.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

