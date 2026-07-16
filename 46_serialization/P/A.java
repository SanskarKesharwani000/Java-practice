import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        City c1 = new City("Hydrabad");
        State s1 = new State("Telangana");
        Address a1 = new Address(c1, s1);
        Student st1 = new Student("Vibhuti", 18, a1);
        
        City c2 = new City("Kanpur");
        State s2 = new State("UP");
        Address a2 = new Address(c2, s2);
        Student st2 = new Student("Prabhat", 21, a2);

        ArrayList<Student> list = new ArrayList<>();
        
        list.add(st1);
        list.add(st2);
            
        try {
            FileOutputStream fos = new FileOutputStream("record.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
