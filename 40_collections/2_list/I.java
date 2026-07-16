import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<Student3>();

        Student3 a1 = new Student3("om", 12);
        Student3 a2 = new Student3("ram", 7);
        Student3 a3 = new Student3("shyam", 9);
        Student3 a4 = new Student3("ghanshyam", 16);
        Student3 a5 = new Student3("khatushyam", 11);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        System.out.println(list);

        Student3 x = new Student3("shyam", 12);
        System.out.println(list.remove(x));
        
        System.out.println(list);
    }
}

class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Student3)obj).name);
    }

    public String toString() {
        return name + " - " + age;
    }
}
