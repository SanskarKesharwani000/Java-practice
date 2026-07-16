class L {
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof Object) {
            System.out.println("SportsCar IS-A Object");
        } else {
            System.out.println("SportsCar IS-NOT-A Object");            
        }
    }    
}
