import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList<Student5> list = new ArrayList<Student5>();

        Student5 a1 = new Student5("om", 12);
        Student5 a2 = new Student5("ram", 7);
        Student5 a3 = new Student5(new String("shyam"), 9);
        Student5 a4 = new Student5("ghanshyam", 16);
        Student5 a5 = new Student5("khatushyam", 11);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        System.out.println(list);

        // Student5 x = new Student5(new String("shyam"), 9);
        Student5 x = new Student5(new String("yamraj"), 9);
        System.out.println(list.remove(x));
        
        System.out.println(list);
    }
}

class Student5 {
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        Student5 a = this;
        Student5 b = (Student5)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        int ag1 = a.age;
        int ag2 = b.age;

        System.out.println(a.name + " - " + b.name);

        return nm1.equals(nm2) && ag1 == ag2;
    }

    public String toString() {
        return name + " - " + age;
    }
}
