class J {
    public static void main(String[] args) {
        Address2 addr = new Address2();
        addr.cityName = "jabalpur";
        addr.stateName = "mp";

        Student6 x = new Student6("om", 12 , addr);

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress2().cityName + " -- " + x.getAddress2().stateName);

        // String name = x.getName();
        // int age = x.getAge();
        // Address2 adr = x.getAddress2();
        // name = "Karthik";
        // age = 34;
        // adr.cityName = "Thiruvanantpuram";
        // adr.stateName = "Tamilnadu";

        addr.cityName = "Jaipur";
        addr.stateName = "Rajasthan";

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress2().cityName + " -- " + x.getAddress2().stateName);
    }
}

class Address2 {
    String cityName;
    String stateName;
}

// encapsulated immutable class
final class Student6 {
    private final String name;
    private final int age;
    private final Address2 address;

    Student6(String name, int age, Address2 address) {
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

    public Address2 getAddress2() {
        // return address;
        Address2 addr = new Address2();
        addr.cityName = address.cityName;
        addr.stateName = address.stateName;
        return addr;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void setAddress2(Address2 address) {
    //     this.address = address;
    // }
}
