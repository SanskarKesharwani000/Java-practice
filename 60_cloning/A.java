class A {
    public static void main(String[] args) {
        Student x = new Student("ketak", 12);
        
        Student y = x;
        
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