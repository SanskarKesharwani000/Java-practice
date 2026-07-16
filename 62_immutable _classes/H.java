class H {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.cityName = "jabalpur";
        addr.stateName = "mp";

        Student4 x = new Student4("om", 12 , addr);

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress().cityName + " -- " + x.getAddress().stateName);

        String name = x.getName();
        int age = x.getAge();
        Address adr = x.getAddress();
        name = "Karthik";
        age = 34;
        adr.cityName = "Thiruvanantpuram";
        adr.stateName = "Tamilnadu";

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress().cityName + " -- " + x.getAddress().stateName);
    }
}

class Address {
    String cityName;
    String stateName;
}

// encapsulated immutable class
final class Student4 {
    private final String name;
    private final int age;
    private final Address address;

    Student4(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void setAddress(Address address) {
    //     this.address = address;
    // }
}
