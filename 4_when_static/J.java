// here we mark calcArea method as non static because it is operating on instance variable of that class.

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
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    
}

