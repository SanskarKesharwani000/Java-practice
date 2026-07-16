import java.util.TreeSet;

class Y {
    public static void main(String[] args) {
        TreeSet<Student3> set = new TreeSet<Student3>();

        set.add(new Student3("indresh", 23));
        set.add(new Student3("ganesh", 18));
        set.add(new Student3("manoj", 7));
        set.add(new Student3("gyanesh", 17));
        set.add(new Student3("jeetendra", 12));
        set.add(new Student3("dinesh", 5));
        
        System.out.println(set);
    }
}