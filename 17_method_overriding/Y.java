class Y {
    static void playSound(Cat cat) {
        cat.makeSound();
    }   

    static void playSound(Dog dog) {
        dog.makeSound();
    }

    static void playSound(Cow cow) {
        cow.makeSound();
    }
    
    public static void main(String[] args) {
        Cat cat  = new Cat();

        Cow cow  = new Cow();

        Dog dog = new Dog();

        playSound(cat);
        playSound(dog);
        playSound(cow);
    }
}
