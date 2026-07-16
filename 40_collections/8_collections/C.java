import java.util.ArrayList;
import java.util.Collections;

class C {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Samyak", 34));
        list.add(new Employee("Ekta", 28));
        list.add(new Employee(" Mohit", 25));
        list.add(new Employee("Jayesh", 30));
        list.add(new Employee("Balendra", 45));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}



// C.java:16: error: no suitable method found for sort(ArrayList<Employee>)
//         Collections.sort(list);
//                    ^
//     method Collections.<T#1>sort(List<T#1>) is not applicable
//       (inference variable T#1 has incompatible bounds
//         equality constraints: Employee
//         lower bounds: Comparable<? super T#1>)
//     method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
//       (cannot infer type-variable(s) T#2
//         (actual and formal argument lists differ in length))
//   where T#1,T#2 are type-variables:
//     T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
//     T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
// 1 error