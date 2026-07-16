class Car { }
class SportsCar extends Car { }

class E {
    static void pro(SportsCar w) {
        System.out.println("SportsCar");
    }

    static void pro(Car w) {
        System.out.println("Car");
    }
    
    public static void main(String[] args) {
        Car z = new SportsCar();

        pro(z);
    }
}
