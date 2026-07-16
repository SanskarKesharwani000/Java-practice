class H {
    H(Cat cat) {

    }    

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();

        // ok
        new H(cat);

        // not ok 
        new H(dog);
        new H(car);
    }
}
