class O {
    public static void main(String[] args) {
        Vehicle x = new Vehicle();

        if(x instanceof SportsCar) {
            System.out.println("Vehicle IS-A SportsCar");
        } else {
            System.out.println("Vehicle IS-NOT-A SportsCar");            
        }
    }    
}