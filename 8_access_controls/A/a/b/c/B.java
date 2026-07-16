// public access control is accessed in same package and in outside the package with inheritance and instantiation both

package a.b.c;

class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y); 
    }
}