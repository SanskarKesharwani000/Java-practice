import java.util.ArrayList;

class K1 {
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<Employee1>();

        list.add(new Employee1("Pratap", 27));
        list.add(new Employee1("Jagtap", 31));
        list.add(new Employee1("Suryatap", 47));
        list.add(new Employee1("Paschatap", 100));
        list.add(new Employee1("Chandrtap", 25));

        System.out.println(list);

        Employee1 z = new Employee1("Paschatap", 100);
        System.out.println(list.contains(z));
        
        System.out.println(list);
    }    
}


class Employee1 {
    String name;
    int age;

    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Employee1)obj).name) && this.age == ((Employee1)obj).age;
    }

    public String toString() {
        return name + " - " + age;
    }
}