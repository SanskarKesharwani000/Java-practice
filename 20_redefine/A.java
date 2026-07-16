class X1 {
    int x = 12;
}

class X extends X1 {
    int x = 45;
}

class A {
    public static void main(String[] args) {
        X1 t = new X();

        System.out.println(t.x);
    }
}