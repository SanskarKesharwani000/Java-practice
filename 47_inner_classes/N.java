class N {
    class X1 {
        int y = 90;
    }
    public static void main(String[] args) {
        N n = new N();

        X1 x = n.new X1();

        System.out.println(x.y);
    }    
}
