// we cannot call defineCircle method directly in static method as its container decides its access.

class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 10;
        
        Circle y = new Circle();
        y.radius = 100;

        x.calcArea();
        y.calcArea();
    
        defineCircle();
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    

    
    void defineCircle(){
        System.out.println("Circle is a....................");
    }
    
}


// K.java:15: error: non-static method defineCircle() cannot be referenced from a static context
//         defineCircle();
//         ^
// 1 error


