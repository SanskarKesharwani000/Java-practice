class Employee {
    String name;
    int age;
    Address address;
    
    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return name + " - " + age + " - " + address;
    }
}
