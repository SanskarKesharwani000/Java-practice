import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class F {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("record2.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee Employee = (Employee)ois.readObject();

            System.out.println(Employee.name);
            System.out.println(Employee.age);
            System.out.println(Employee.address);
            // System.out.println(Employee.address.city.cityName);
            // System.out.println(Employee.address.state.stateName);

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
