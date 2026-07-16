import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("record.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee Employee = (Employee)ois.readObject();

            System.out.println(Employee.name);
            System.out.println(Employee.age);
            System.out.println(Employee.address);
            System.out.println(Employee.address.city);
            System.out.println(Employee.address.state);
            System.out.println(Employee.address.pinCode);

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
