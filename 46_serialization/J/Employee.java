import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
    // transient Address address;
    MyAddress address;


    public Employee(String name, int age, MyAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}