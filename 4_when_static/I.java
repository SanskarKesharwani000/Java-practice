// calcArea method cannot be marked static as it is working on the instance variable radius.

class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 23;
        
        Circle y = new Circle();
        y.radius = 34;

        x.calcArea();
        y.calcArea();
    }
    
    static void calcArea() {
        System.out.println(pi * radius * radius);
    }    
}



// I.java:17: error: non-static variable radius cannot be referenced from a static context
//         System.out.println(pi * radius * radius);
//                                 ^
// I.java:17: error: non-static variable radius cannot be referenced from a static context
//         System.out.println(pi * radius * radius);
//                                          ^
// 2 errors