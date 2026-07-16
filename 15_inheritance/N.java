class E {  }

interface B { } 

class A extends E implements B { }

interface C extends B { }

class D extends A implements C { }

class F extends D implements B { }

class N {
    public static void main(String[] args) {
        F x = new F();

        System.out.println(x instanceof F);
        System.out.println(x instanceof D);
        System.out.println(x instanceof C);
        System.out.println(x instanceof A);
        System.out.println(x instanceof B);
        System.out.println(x instanceof E);
    }
}