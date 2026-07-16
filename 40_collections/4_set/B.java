import java.util.TreeSet;

class B {
    public static void main(String[] args) {
        TreeSet<Student1> set = new TreeSet<Student1>();

        set.add(new Student1("nobita", 8));
        set.add(new Student1("doraemon", 100));
        set.add(new Student1("jiyan", 9));
        set.add(new Student1("sizuka", 8));
        set.add(new Student1("suniyo", 7));
        set.add(new Student1("hathodi", 5));
        set.add(new Student1("dora", 2));
        set.add(new Student1("shinjo", 4));

        System.out.println(set);
    }    
}
