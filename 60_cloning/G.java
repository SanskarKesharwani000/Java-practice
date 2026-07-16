class G {
    public static void main(String[] args) {
        Student x = new Student("vijay", 14);
        
        try {
            Student y = (Student)x.createClone();

            System.out.println(x == y);

            // --------

            System.out.println(x.name);

            y.name = "arijit";

            System.out.println(x.name);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }    
}

class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Object createClone() throws CloneNotSupportedException {
        return clone();
    }
}
