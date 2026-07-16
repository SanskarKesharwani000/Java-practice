import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        City c1 = new City("Chennai");
        State s1 = new State("Tamilnadu");
        Address a1 = new Address(c1, s1);
        Student st1 = new Student("Murugan Swami", 27, a1);
        
        City c2 = new City("Patna");
        State s2 = new State("Bihar");
        Address a2 = new Address(c2, s2);
        Student st2 = new Student("Jagdeep", 32, a2);

        Student[] arr = new Student[2];
        arr[0] = st1;
        arr[1] = st2;
            
        try {
            FileOutputStream fos = new FileOutputStream("record.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(arr);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
