import java.util.Comparator;
import java.util.TreeSet;

class S {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new NameAscSort());

        set.add(new Student("Golu", 12));
        set.add(new Student("Bholu", 9));
        set.add(new Student("Dholu", 7));
        set.add(new Student("Molu", 10));

        System.out.println(set);
    }    
}

class NameAscSort implements Comparator<Student>  {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
