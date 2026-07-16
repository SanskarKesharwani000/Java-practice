class G1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();

        // not ok
        process(dog);
        process(car);

        // ok
        process(cat);
    }   
    
    static <Y> void process(Y a) {
        System.out.println(a);
    } 
}
