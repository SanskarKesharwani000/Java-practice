class J1 {
    public static void main(String[] args) {
        LivingBeing a = new LivingBeing();
        Animal b = new Animal();
        Cat c = new Cat();
        Car r = new Car();

        pro(a);
        pro(b);
        pro(c);
        pro(r);
    }   
    
    // not ok
    static <T super Cat> void pro(T t) {

    }
}
