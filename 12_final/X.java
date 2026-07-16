class X1 {
    final int y = 11;

    final void pro() {
        System.out.println("Hi");
    }
}

class X {
    public static void main(String[] args) {
        X1 a = new X1();

        System.out.println(a.y);
        a.pro();
    }    
}
