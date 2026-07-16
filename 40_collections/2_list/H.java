import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();

        Student2 a1 = new Student2("om", 12);
        Student2 a2 = new Student2("ram", 7);
        Student2 a3 = new Student2("shyam", 9);
        Student2 a4 = new Student2("ghanshyam", 16);
        Student2 a5 = new Student2("khatushyam", 11);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        System.out.println(list);

        Student2 x = new Student2("shyam", 9);
        System.out.println(list.remove(x));
        
        System.out.println(list);
    }
}

class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}
