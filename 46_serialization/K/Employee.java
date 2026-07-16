import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.io.IOException;

class Employee implements Serializable {
    String name;
    int age;
    transient Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeObject(address.city);
            oos.writeObject(address.state);
            oos.writeInt(address.pinCode);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();

            String city = (String)ois.readObject();
            String state = (String)ois.readObject();
            int pinCode = ois.readInt();
            address = new Address(city,state,pinCode);
            
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}