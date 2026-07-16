class G {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();

        // not ok
        // process(dog);
        // process(car);

        // ok
        process(cat);
    }   
    
    static void process(Cat cat) {
        System.out.println(cat);
    } 
}
