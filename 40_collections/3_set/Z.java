import java.util.Comparator;
import java.util.TreeSet;

class Z {
    public static void main(String[] args) {
        NameAscSort a = new NameAscSort();
        TreeSet set = new TreeSet(a);

        set.add(new Student("umesh", 18));
        set.add(new Student("pragyan", 9));
        set.add(new Student("vidit", 12));
        set.add(new Student("sumit", 5));
        set.add(new Student("chandrakant", 15));

        System.out.println(set);
    }
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1; 
        Student s2 = (Student)o2;
        
        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
} 
