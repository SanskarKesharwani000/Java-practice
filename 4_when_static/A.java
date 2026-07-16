// here maxAge is non static but it is same for every object.

class Student {
    String name;
    int age;
    int maxAge = 20;
  
    public static void main(String[] args) {
        Student x = new Student();
        
        x.name = "Rajan";
        x.age = 12;

        Student y = new Student();

        y.name = "Gopal";
        y.age = 14;

        System.out.println(y.age);
        System.out.println(x.name);
    }
}