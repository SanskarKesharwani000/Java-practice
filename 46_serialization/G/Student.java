import java.io.Serializable;

class Student implements Serializable {
    transient String name;
    transient int age;
    float marks;
}