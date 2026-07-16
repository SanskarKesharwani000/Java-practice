// import java.util.Comparator;
import java.util.TreeSet;

class T {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>((a, b) -> a.age.compareTo(b.age));

        set.add(new Student("Golu", 12));
        set.add(new Student("Bholu", 9));
        set.add(new Student("Dholu", 7));
        set.add(new Student("Molu", 10));

        System.out.println(set);
    }    
}

// class NameAscSort implements Comparator<Student>  {
//     public int compare(Student a, Student b) {
//         return a.name.compareTo(b.name);
//     }
// }

// (a, b) -> a.age.compareTo(b.age);


