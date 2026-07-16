package a.b;

import x.y.z.B;

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("x.y.z.B");

        System.out.println(k);
    }
}