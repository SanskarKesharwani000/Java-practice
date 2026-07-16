class H2 {
    <W extends Animal> H2(W w) {
        System.out.println(w);
    } 

    // <W extends Car> H2(W w) {
    //     System.out.println(w);
    // }    

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();

        // ok
        new H2(cat);
        new H2(dog);

        // not ok
        new H2(car);
    }
}
