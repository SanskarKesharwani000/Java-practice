class J{
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof Car) {
            System.out.println("SportsCar IS-A Car");
        } else {
            System.out.println("SportsCar IS-NOT-A Car");            
        }
    }    
}
