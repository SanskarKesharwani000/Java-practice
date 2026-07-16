class H1 {
    <W> H1(W w) {
        System.out.println(w);
    }    

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();

        // ok
        new H1(cat);
        new H1(dog);
        new H1(car);
    }
}
