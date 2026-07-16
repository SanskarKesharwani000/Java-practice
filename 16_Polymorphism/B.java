interface B1 {

}

class B2 {

}

class B extends B2 implements B1 {
    public static void main(String[] args) {
        B a = new B();
        B2 b = new B();
        B1 c = new B();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
