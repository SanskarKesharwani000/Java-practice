class G2 {
    public static void main(String[] args) {

        Animal x = (Animal)new LivingBeing();
        // Incompatible Types...

        // Animal x = (Animal)new Cat();

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.ClassCastException: class LivingBeing cannot be cast to class Animal (LivingBeing and Animal are in unnamed module of loader 'app')
//         at G2.main(G2.java:4)
