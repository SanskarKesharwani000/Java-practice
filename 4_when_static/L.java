// defineCircle method should be static as it is not accessing any instance variable of that class.

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
    
        // defineCircle();
        x.defineCircle();
        y.defineCircle();
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    
    
    void defineCircle(){
        System.out.println("A circle is a round, two-dimensional geometric shape defined as the set of all points in a plane that are equidistant from a fixed central point");
    }    
}