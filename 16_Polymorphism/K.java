class K {
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof Vehicle) {
            System.out.println("SportsCar IS-A Vehicle");
        } else {
            System.out.println("SportsCar IS-NOT-A Vehicle");            
        }
    }    
}
