// here value of pi is same for every object so we should mark it static to avoid memory wastage.

class Circle {
    int radius;
    float pi = 3.14f;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 23;
        
        Circle y = new Circle();
        y.radius = 34;
    }
}
