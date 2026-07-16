// java.lang.Cloneable (marker-interface)
// java.lang.CloneNotSupportedException

class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student x = new Student("chetak", 12);
        
        // Student y = x;
        try {
            Student y = (Student)x.clone();

            System.out.println(x == y);
    
            // -------------------
            System.out.println(x.name);
    
            y.name = "prabhu";
    
            System.out.println(x.name);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }        
    }
}
