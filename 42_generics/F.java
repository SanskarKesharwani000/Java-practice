class F {
    public static void main(String[] args) {
        Rental<Car> x = new Rental<>();

        Scooter a = new Scooter();
        //not ok
        // x.add(a);

        Car b = new Car();
        x.add(b);

        // Scooter c1 = x.rent(); // not ok
        Car c2 = x.rent();

        // -----------------------------

        Rental<Scooter> y = new Rental<>();

        // y.add(b); // not ok
        y.add(a);

        // Car e1 = y.rent(); // not ok
        Scooter e2 = y.rent();
    }    
}
