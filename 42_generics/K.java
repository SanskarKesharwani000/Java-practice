import java.util.ArrayList;
import java.util.Collections;

class K {
    public static void main(String[] args) {
        // ArrayList<Student> list = new ArrayList<>();
        ArrayList<Employee> list = new ArrayList<>();

        Collections.sort(list);
    }
}

class Student {

}

class Employee extends User {

}

class User implements Comparable<User> {
    public int compareTo(User user) {
        //---
        return 1;
    }
}
