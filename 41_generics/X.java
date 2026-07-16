import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        ArrayList<Dog> x = new ArrayList<Dog>();

        x.add(new Dog());
        x.add(new Dog());
        x.add(new Dog());

        ArrayList<Animal> y = new ArrayList<Animal>();

        y.add(new Animal());
        y.add(new Animal());
        y.add(new Animal());

        ArrayList<LivingBeing> z = new ArrayList<LivingBeing>();

        z.add(new LivingBeing());
        z.add(new LivingBeing());
        z.add(new LivingBeing());

        process(x);
        process(y);
        process(z);
    }   
    
    static void process(ArrayList<? super Dog> x) {
        System.out.println(x);        
        System.out.println("+++++++++++++++++++++");        
    }
}
