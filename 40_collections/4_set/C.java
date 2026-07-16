import java.util.Comparator;
import java.util.TreeSet;

class C {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>(new NameAscSort());

        set.add(new Student("nobita", 8));
        set.add(new Student("doraemon", 100));
        set.add(new Student("jiyan", 9));
        set.add(new Student("sizuka", 8));
        set.add(new Student("suniyo", 7));
        set.add(new Student("hathodi", 5));
        set.add(new Student("dora", 2));
        set.add(new Student("shinjo", 4));

        System.out.println(set);
    }    
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
    
    // public int compare(Object o1, Object o2) {
    //     Student a = (Student)o1;
    //     Student b = (Student)o2;

    //     String nm1 = a.name;
    //     String nm2 = b.name;

    //     return nm1.compareTo(nm2);
    // }
}