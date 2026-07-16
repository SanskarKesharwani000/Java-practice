import java.io.Serializable;

class Student extends User implements Serializable {
    String degree;
    String branch;
    int semester;

    Student() {
        super("ganesh");
        System.out.println("Hi");
    }
}
