class K1 {
    static void pro(Animal... x) {
        for(Animal next : x) {
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Animal anm = new Animal();

        LivingBeing y = new Cat();

        pro(cat, cow, dog, anm, (Animal)y);
    }    
}