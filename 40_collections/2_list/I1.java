import java.util.ArrayList;

class I1 {
    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<Student4>();

        Student4 a1 = new Student4("om", 12);
        Student4 a2 = new Student4("ram", 7);
        Student4 a3 = new Student4(new String("shyam"), 9);
        Student4 a4 = new Student4("ghanshyam", 16);
        Student4 a5 = new Student4("khatushyam", 11);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        System.out.println(list);

        Student4 x = new Student4(new String("shyam"), 9);
        System.out.println(list.remove(x));
        
        System.out.println(list);
    }
}

class Student4 {
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Student4)obj).name) && this.age == ((Student4)obj).age;
    }

    public String toString() {
        return name + " - " + age;
    }
}
