class User {
    String name;
    int age;
}

class Employee extends User implements Cloneable {
    String designation;
    float salary;

    @Override
    public Employee clone() {
        Employee z = null;

        try {
            z = (Employee)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return z;
    }
}

class P {
    public static void main(String[] args) {
        Employee x = new Employee();

        x.name = "yamraj";
        x.age = 10000;
        x.designation = "death manager";
        x.salary = 0f;

        Employee y = x.clone();

        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(y.designation);
        System.out.println(y.salary);
    }    
}
