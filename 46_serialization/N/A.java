import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        City c1 = new City("Nagpur");
        State s1 = new State("MH");
        Address a1 = new Address(c1, s1);
        Student st = new Student("Amit Deshpandey", 22, a1);
        
        City c2 = new City("Bengaluru");
        State s2 = new State("KA");
        Address a2 = new Address(c2, s2);
        Employee emp = new Employee("Krishnan Iyer", 35, a2);
            
        try {
            FileOutputStream fos = new FileOutputStream("record.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st);
            oos.writeObject(emp);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
