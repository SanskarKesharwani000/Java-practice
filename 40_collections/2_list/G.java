import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList<Student1> x = new ArrayList<Student1>();

        x.add(new Student1("mohan", 9));
        x.add(new Student1("sohan", 7));
        x.add(new Student1("rohan", 12));
        x.add(new Student1("tohan", 15));
        x.add(new Student1("gohan", 8));

        System.out.println(x);
    }
}

class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age; 
    }
}