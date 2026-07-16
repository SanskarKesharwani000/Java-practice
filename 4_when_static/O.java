// here getPi method is static so it is accessible from class name and directly in static method and with object of that class.

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


        System.out.println(getPi());
        System.out.println(x.getPi()); // here object name is replaced with class name.
        System.out.println(y.getPi());
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    
    
    static void defineCircle() {
        System.out.println("A circle is a round, two-dimensional geometric shape defined as the set of all points in a plane that are equidistant from a fixed central point");
    }    
    
    static float getPi() {
        return pi;
    }
    
}