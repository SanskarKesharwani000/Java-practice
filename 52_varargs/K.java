class K {
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

        pro(cat, cow, dog, anm, y);
    }    
}



// K.java:16: error: method pro in class K cannot be applied to given types;
//         pro(cat, cow, dog, anm, y);
//         ^
//   required: Animal[]
//   found:    Cat,Cow,Dog,Animal,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error