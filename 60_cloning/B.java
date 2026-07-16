class B {
    
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

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


// B.java:6: error: clone() has protected access in Object
//         Student y = x.clone();
//                      ^
// B.java:6: error: incompatible types: Object cannot be converted to Student
//         Student y = x.clone();
//                            ^
// 2 errors