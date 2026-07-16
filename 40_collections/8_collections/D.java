import java.util.ArrayList;
import java.util.Collections;

class D {
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<Employee1>();

        list.add(new Employee1("Samyak", 34));
        list.add(new Employee1("Ekta", 28));
        list.add(new Employee1("Mohit", 25));
        list.add(new Employee1("Jayesh", 30));
        list.add(new Employee1("Balendra", 45));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
