import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
    Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
