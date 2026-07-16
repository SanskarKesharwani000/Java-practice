class K {
    public static void main(String[] args) {
        Address3 addr = new Address3();
        addr.cityName = "jabalpur";
        addr.stateName = "mp";

        Student7 x = new Student7("om", 12 , addr);

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress3().cityName + " -- " + x.getAddress3().stateName);

        // String name = x.getName();
        // int age = x.getAge();
        // Address3 adr = x.getAddress3();
        // name = "Karthik";
        // age = 34;
        // adr.cityName = "Thiruvanantpuram";
        // adr.stateName = "Tamilnadu";

        addr.cityName = "Jaipur";
        addr.stateName = "Rajasthan";

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x.getAddress3().cityName + " -- " + x.getAddress3().stateName);
    }
}

class Address3 {
    String cityName;
    String stateName;
}

// encapsulated immutable class
final class Student7 {
    private final String name;
    private final int age;
    private final Address3 address;

    Student7(String name, int age, Address3 address) {
        this.name = name;
        this.age = age;
        // this.address = address;
        Address3 addr = new Address3();
        addr.cityName = address.cityName;
        addr.stateName = address.stateName;
        this.address = addr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address3 getAddress3() {
        // return address;
        Address3 addr = new Address3();
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

    // public void setAddress3(Address3 address) {
    //     this.address = address;
    // }
}
