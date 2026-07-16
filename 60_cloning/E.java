class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student x = new Student("ketak", 12);
        
        // Student y = x;
        try {
            Student y = (Student)x.clone();

            System.out.println(x == y);
    
            // -------------------
            System.out.println(x.name);
    
            y.name = "govind";
    
            System.out.println(x.name);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }        
    }
}


// java.lang.CloneNotSupportedException: Student
//         at java.base/java.lang.Object.clone(Native Method)
//         at Student.main(E.java:15)
