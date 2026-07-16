// here we cannot mark the method static as it uses instance variables.

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
    }

    static void showInfo() {
        System.out.println(name + " - " + age);
    }
}


// C.java:23: error: non-static variable name cannot be referenced from a static context
//         System.out.println(name + " - " + age);
//                            ^
// C.java:23: error: non-static variable age cannot be referenced from a static context
//         System.out.println(name + " - " + age);
//                                           ^
// 2 errors