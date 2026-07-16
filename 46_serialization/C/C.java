import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class C {
    public static void main(String[] args) {
        City city = new City("Jabalpur");
        State state = new State("MP");

        Address addr = new Address(city, state);

        Student st = new Student("Gopal", 22, addr);
        // Student st = new Student("Deenanath", 20, new Address(new City("Jaipur"), new State("Rajasthan")));
    
        try {
            FileOutputStream fos = new FileOutputStream("record.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
