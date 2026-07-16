import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Pratap", 27));
        list.add(new Employee("Jagtap", 31));
        list.add(new Employee("Suryatap", 47));
        list.add(new Employee("Paschatap", 100));
        list.add(new Employee("Chandrtap", 25));

        System.out.println(list);

        Employee z = new Employee("Paschatap", 100);
        System.out.println(list.contains(z));
        
        System.out.println(list);
    }    
}


class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}