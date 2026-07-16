import java.util.ArrayList;

class F {
    public static void main(String[] args) {
        ArrayList<Student> x = new ArrayList<Student>();

        x.add(new Student("mohan", 9));
        x.add(new Student("sohan", 7));
        x.add(new Student("rohan", 12));
        x.add(new Student("tohan", 15));
        x.add(new Student("gohan", 8));

        System.out.println(x);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}