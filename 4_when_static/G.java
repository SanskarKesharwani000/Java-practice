// here we mark variable pi as static .

class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 23;
        
        Circle y = new Circle();
        y.radius = 34;

        System.out.println(x.radius);
        System.out.println(y.radius);
    }
}
