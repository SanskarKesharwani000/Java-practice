// here getPi method should be static as it returns staic variable value and here the memory wastage is done.

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

        x.getPi();
        y.getPi();
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    
    
    static void defineCircle(){
        System.out.println("A circle is a round, two-dimensional geometric shape defined as the set of all points in a plane that are equidistant from a fixed central point");
    }    

    
    float getPi() {
        return pi;
    }
    
}