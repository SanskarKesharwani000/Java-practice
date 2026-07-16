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
            
            oos.writeObject(address.city.cityName);
            oos.writeObject(address.state.stateName);
            oos.writeInt(address.pinCode);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();

            City city = new City();
            city.cityName = (String)ois.readObject();

            State state = new State();
            state.stateName = (String)ois.readObject();

            int pinCode = ois.readInt();

            address = new Address();

            address.city = city;
            address.state = state;
            address.pinCode = pinCode;
            
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}