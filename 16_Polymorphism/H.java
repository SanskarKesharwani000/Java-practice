class H {
    public static void main(String[] args) {
        SportsCar x = new SportsCar();

        System.out.println(x instanceof SportsCar);
        System.out.println(x instanceof Car);
        System.out.println(x instanceof Vehicle);
        System.out.println(x instanceof Object);
    }    
}
