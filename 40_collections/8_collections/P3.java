import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class P3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Samyak", 34));
        list.add(new Employee("Ekta", 72));
        list.add(new Employee("Mohit", 25));
        list.add(new Employee("Jayesh", 51));
        list.add(new Employee("Balendra", 27));
    
        System.out.println(list);

        AgeDscSort nas = new AgeDscSort();

        Collections.sort(list, nas);

        System.out.println(list);
    
        Employee e = new Employee("Mohit", 51);

        System.out.println(Collections.binarySearch(list, e, nas));

    }
}


class NameAscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeAscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o2.age.compareTo(o1.age);
    }
}

class NameDscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o2.name.compareTo(o1.name);
    }
}
