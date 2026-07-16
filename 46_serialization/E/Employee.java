import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
    transient Address1 address;

    public Employee(String name, int age, Address1 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}