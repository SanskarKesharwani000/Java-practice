import java.util.ArrayList;
import java.util.Collections;

class M {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Samyak", 34));
        list.add(new Employee("Ekta", 28));
        list.add(new Employee("Mohit", 25));
        list.add(new Employee("Jayesh", 30));
        list.add(new Employee("Balendra", 45));
    
    
        Employee e = new Employee("Mohit", 25);

        System.out.println(Collections.binarySearch(list, e));

    }
}


// M.java:17: error: no suitable method found for binarySearch(ArrayList<Employee>,Employee)
//         System.out.println(Collections.binarySearch(list, e));
//                                       ^
//     method Collections.<T#1>binarySearch(List<? extends Comparable<? super T#1>>,T#1) is not applicable
//       (cannot infer type-variable(s) T#1
//         (argument mismatch; ArrayList<Employee> cannot be converted to List<? extends Comparable<? super T#1>>))
//     method Collections.<T#2>binarySearch(List<? extends T#2>,T#2,Comparator<? super T#2>) is not applicable
//       (cannot infer type-variable(s) T#2
//         (actual and formal argument lists differ in length))
//   where T#1,T#2 are type-variables:
//     T#1 extends Object declared in method <T#1>binarySearch(List<? extends Comparable<? super T#1>>,T#1)
//     T#2 extends Object declared in method <T#2>binarySearch(List<? extends T#2>,T#2,Comparator<? super T#2>)
// 1 error