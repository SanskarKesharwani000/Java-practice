import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class E {
    public static void main(String[] args) {
        City city = new City("Jabalpur");
        State state = new State("MP");

        Address1 addr = new Address1(city, state);

        // Employee st = new Employee("Gopal", 22, addr);
        Employee st = new Employee("Deenanath", 20, new Address1(new City("Jaipur"), new State("Rajasthan")));
    
        try {
            FileOutputStream fos = new FileOutputStream("record2.txt");

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

