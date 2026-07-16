// here we mark the variable as instance variable so it is accessible by only instance methods and object of that class.

class Student {
    String name;
    int age;

    void showName() {
        System.out.println(name);
    }

    void showAge() {
        System.out.println(age);

        showName();
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.name = "jamwant";
        a.age = 78;
        
        Student b = new Student();
        b.name = "Sugreev";
        b.age = 43;

        a.showAge();

    }
}
