class X2 {
    final int y = 7;

    final void pro() {
        System.out.println("Hiiiiiiiiii!!!");
    }
}

class X1 extends X2 { 
    public static void main(String[] args) {
        X1 a = new X1();

        System.out.println(a.y);
        a.pro();
    }
}
