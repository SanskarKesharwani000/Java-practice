class I {
    public static void main(String[] args) {
        Address1 addr = new Address1();
        addr.cityName = "jabalpur";
        addr.stateName = "mp";

        Student5 x = new Student5("om", 12 , addr);

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress1().cityName + " -- " + x.getAddress1().stateName);

        String name = x.getName();
        int age = x.getAge();
        Address1 adr = x.getAddress1();
        name = "Karthik";
        age = 34;
        adr.cityName = "Thiruvanantpuram";
        adr.stateName = "Tamilnadu";

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress1().cityName + " -- " + x.getAddress1().stateName);
    }
}

class Address1 {
    String cityName;
    String stateName;
}

// encapsulated immutable class
final class Student5 {
    private final String name;
    private final int age;
    private final Address1 address;

    Student5(String name, int age, Address1 address) {
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

    public Address1 getAddress1() {
        // return address;
        Address1 addr = new Address1();
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

    // public void setAddress1(Address1 address) {
    //     this.address = address;
    // }
}
