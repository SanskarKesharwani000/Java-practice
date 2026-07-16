import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class D {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("record.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();

            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.address.city.cityName);
            System.out.println(student.address.state.stateName);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
