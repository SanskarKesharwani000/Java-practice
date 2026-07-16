import java.io.Serializable;

class Student implements Serializable {
    transient String name = "Indradev";
    transient int age = 20;
    float marks;

    Student() {
        System.out.println("jay ho...");
    }
}