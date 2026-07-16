// we cannot mark radius as static as it is different for every variable.

class Circle {
    static int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 23;
        
        Circle y = new Circle();
        y.radius = 34;
        
        Circle z = new Circle();
        z.radius = 52;

        System.out.println(x.radius);
        System.out.println(y.radius);
        System.out.println(z.radius);
    }
}
