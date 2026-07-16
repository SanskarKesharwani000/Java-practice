import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("info.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Shape1 sh = (Shape1)ois.readObject();

            System.out.println(sh);

            ois.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
