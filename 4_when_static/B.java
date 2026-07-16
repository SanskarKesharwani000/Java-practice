// here we mark maxAge as static as it is same for every object and avoid memory wastage.

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

        System.out.println(y.name + " - " + y.age + " - " + x.maxAge);
        System.out.println(x.name + " - " + x.age + " - " + y.maxAge);
    }
}