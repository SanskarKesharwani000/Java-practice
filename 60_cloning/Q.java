class Q {
    public static void main(String[] args) {
        Student x = new Student("raghav", 23, new Address1("bhopal", "MP"));

        Student y = x.clone();

        System.out.println(x == y);

        System.out.println(x.address == y.address);
    }    
}

class Student implements Cloneable {
    String name;
    int age;
    Address1 address;

    Student(String name, int age, Address1 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student clone() {
        Student z = null;
        
        try {
            z = (Student)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        z.address = address.clone();
        
        return z;
    }
}

class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Address1 extends Address implements Cloneable {
    
    Address1(String city, String state) {
        super(city, state);
    }

    @Override
    public Address1 clone() {
        Address1 addr = null;

        try {
            addr = (Address1)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return addr;
    }
}

