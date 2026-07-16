class M {
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof Bus) {
            System.out.println("SportsCar IS-A Bus");
        } else {
            System.out.println("SportsCar IS-NOT-A Bus");            
        }
    }    
}
