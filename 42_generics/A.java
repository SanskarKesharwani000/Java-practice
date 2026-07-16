import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        // On/Off(One at a time) line: 6, 7, 8, and 9
        // ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        // ArrayList<? super Dog> x1 = new ArrayList<Animal>();
        // ArrayList<? super Dog> x1 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> x1 = new ArrayList<Object>();

        // ArrayList<? super Dog> x1 = new ArrayList<BDog>(); // not ok

        Object a = new Object();
        LivingBeing b = new LivingBeing();
        Animal c = new Animal();
        Dog d = new Dog();
        BDog e = new BDog();

        x1.add(a);
        x1.add(b);
        x1.add(c);
        x1.add(d);
        x1.add(e);
    }
}