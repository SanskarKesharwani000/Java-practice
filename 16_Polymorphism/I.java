class I {
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof SportsCar) {
            System.out.println("SportsCar IS-A SportsCar");
        } else {
            System.out.println("SportsCar IS-NOT-A SportsCar");            
        }
    }    
}
