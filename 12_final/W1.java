// In this example for every object the value of instance variable can be changed but we cannot reassign value of instance variable for an object of that class.

class W1 {
    final int y;
    
    W1(int q) {
        y = q;
    }

    public static void main(String[] args) {
        W1 a = new W1(7);
        System.out.println(a.y);
        W1 b = new W1(11);
        System.out.println(b.y);
        W1 c = new W1(19);
        System.out.println(c.y);
    }
}
