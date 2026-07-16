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
        Student y = x.clone();
        
        System.out.println(x == y);

        // -------------------
        System.out.println(x.name);

        y.name = "govind";

        System.out.println(x.name);
    }
}


// C.java:14: error: incompatible types: Object cannot be converted to Student
//         Student y = x.clone();
//                            ^
// 1 error
