class G5 {
    public static void main(String[] args) {
        LivingBeing x = new Human();

        Animal y = (Animal)x;

        System.out.println(y);
    }    
}


// Exception in thread "main" java.lang.ClassCastException: class Human cannot be cast to class Animal (Human and Animal are in unnamed module of loader 'app')
//         at G5.main(G5.java:5)