import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("r1.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s1 = (Student)ois.readObject();
            
            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.maxAge);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                      
            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("r2.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s1 = (Student)ois.readObject();
            
            System.out.println(s1.name);
            System.out.println(s1.age);            
            System.out.println(s1.maxAge);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                      
            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }



        try {
            FileInputStream fis = new FileInputStream("r3.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s1 = (Student)ois.readObject();
            
            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.maxAge);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                      
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
