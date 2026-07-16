import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class E {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Samyak", 34));
        list.add(new Employee("Ekta", 28));
        list.add(new Employee("Mohit", 25));
        list.add(new Employee("Jayesh", 30));
        list.add(new Employee("Balendra", 45));

        System.out.println(list);

        Collections.sort(list, new NameDscSort());

        System.out.println(list);
    }
}

class NameDscSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}
