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
        Student y = (Student)x.clone();
        
        System.out.println(x == y);

        // -------------------
        System.out.println(x.name);

        y.name = "govind";

        System.out.println(x.name);
    }
}


// D.java:14: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         Student y = (Student)x.clone();
//                                     ^
// 1 error