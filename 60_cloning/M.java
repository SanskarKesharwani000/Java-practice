class M {
    public static void main(String[] args) {
        Student x = new Student("mohan", 18, new Address("jabp", "MP"));

        Student y = x.clone();

        System.out.println(x == y);

        System.out.println(x.address == y.address);
    }    
}

class Student implements Cloneable {
    String name;
    int age;
    Address address;

    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student clone() {
        Student x = null;
        
        try {
            x = (Student)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return x;
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
