package a;

import b.B;

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("b.B");

        System.out.println(k);
    }
}