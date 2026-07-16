class G2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Car car = new Car();
        Animal anm = new Animal();

        
        // not ok
        process(car);
        
        // ok
        process(dog);
        process(anm);
        process(cat);
    }   
    
    static <Y extends Animal> void process(Y a) {
        System.out.println(a);
    } 
}
