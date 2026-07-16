import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("record.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s1 = (Student)ois.readObject();
            Student s2 = (Student)ois.readObject();

            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.address.city.cityName);
            System.out.println(s1.address.state.stateName);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(s2.name);
            System.out.println(s2.age);
            System.out.println(s2.address.city.cityName);
            System.out.println(s2.address.state.stateName);

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
