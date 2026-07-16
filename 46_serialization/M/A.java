import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        City c1 = new City("Coimbatur");
        State s1 = new State("Tamilnadu");
        Address a1 = new Address(c1, s1);
        Student st1 = new Student("Chandrashekhar", 22, a1);
        
        City c2 = new City("Kolkata");
        State s2 = new State("Westbengal");
        Address a2 = new Address(c2, s2);
        Student st2 = new Student("Bipin", 28, a2);
            
        try {
            FileOutputStream fos = new FileOutputStream("record.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st1);
            oos.writeObject(st2);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
