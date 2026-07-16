class M {
    public static void main(String[] args) {
        Shape a = new Shape(20);

        Shape b = new Shape(20, 30);

        Shape c = new Shape(20, 30, 40);

        System.out.println(a.length + " ----- " + a.width + " ------  " + a.height);
        System.out.println(b.length + " ----- " + b.width + " ------  " + b.height);
        System.out.println(c.length + " ----- " + c.width + " ------  " + c.height);
    }    
}
