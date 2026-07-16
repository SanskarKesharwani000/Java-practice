class T {
    class X1 {
        X1() {
            System.out.println("X1()");
        }
    }   
    
    public static void main(String[] args) {
        T t = new T();

        X1 x1 = t.new X1();
        X1 x2 = t.new X1();
        X1 x3 = t.new X1();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
