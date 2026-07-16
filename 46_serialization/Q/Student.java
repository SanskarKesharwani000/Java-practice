import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;

    static int maxAge = 21;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
