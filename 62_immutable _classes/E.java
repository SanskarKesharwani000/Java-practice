class E {
    public static void main(String[] args) {
        Student1 x = new Student1("om", 12);

        System.out.println(x.name + " --- " + x.age + " ---- " + x);

        x.name = "ram";
        x.age = 23;

        System.out.println(x.name + " --- " + x.age + " ---- " + x);
    }
}

// mutable class
class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
