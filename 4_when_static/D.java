// here we mark maxAge as non static as it is operating on every object specifically.

class Student {
    String name;
    int age;
    static int maxAge = 20;
  
    public static void main(String[] args) {
        Student x = new Student();
        
        x.name = "Rajan";
        x.age = 12;

        Student y = new Student();

        y.name = "Gopal";
        y.age = 14;

        // System.out.println(y.name + " - " + y.age);
        // System.out.println(x.name + " - " + x.age);
        x.showInfo();
        y.showInfo();
    }

    void showInfo() {
        System.out.println(name + " - " + age + " - " + maxAge);
    }
}