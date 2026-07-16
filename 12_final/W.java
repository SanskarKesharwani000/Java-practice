// The value of instance final variable is initialized inside the constructor for every object of that class.

class W {
    final int y;
    
    W() {
        y = 7;
    }

    public static void main(String[] args) {
        W a = new W();
        System.out.println(a.y);
        W b = new W();
        System.out.println(b.y);
    }
}
