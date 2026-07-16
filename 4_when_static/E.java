// we cannot mark name and age static as it is different for every object of that class.

class Student {
    static String name;
    static int age;
    static int maxAge = 20;
  
    public static void main(String[] args) {
        Student x = new Student();
        
        x.name = "Rajan";
        x.age = 12;

        Student y = new Student();

        y.name = "Gopal";
        y.age = 14;

        x.showInfo();
        y.showInfo();
    }

    void showInfo() {
        System.out.println(name + " - " + age + " - " + maxAge);
    }
}