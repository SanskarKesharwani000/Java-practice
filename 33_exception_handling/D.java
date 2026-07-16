class D {
    public static void main(String[] args) {
        System.out.println("-----start");

        Animal x = new Cat();

        Dog y = (Dog)x;

        System.out.println("-----end");
    }    
}

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }


// -----start
// Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
//         at D.main(D.java:7)