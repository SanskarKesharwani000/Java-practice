// polymorphic Assignment

class A2 {

}

class A1 extends A2 {

}

class A extends A1 {
    public static void main(String[] args) {
        A a = new A();

        A1 b = new A();

        A2 c = new A();

        Object d = new A();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}