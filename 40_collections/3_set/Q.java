import java.util.HashSet;
import java.util.LinkedHashSet;

class Q {
    public static void main(String[] args) {
        // HashSet<Student2> x = new HashSet<Student2>();
        LinkedHashSet<Student2> x = new LinkedHashSet<Student2>();

        x.add(new Student2("bheem", 9));
        x.add(new Student2("raju", 2));
        x.add(new Student2("kaliya", 2));
        x.add(new Student2("jaggu", 5));
        x.add(new Student2("chutki", 7));

        System.out.println(x);
    } 
}