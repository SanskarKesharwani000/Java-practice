import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("record.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student[] arr = (Student[])ois.readObject();

            for(Student s1 : arr) {
                System.out.println(s1.name);
                System.out.println(s1.age);
                System.out.println(s1.address.city.cityName);
                System.out.println(s1.address.state.stateName);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            

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
