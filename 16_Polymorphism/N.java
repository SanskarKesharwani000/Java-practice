class N {
    public static void main(String[] args) {
        Car x = new SportsCar();

        if(x instanceof Bus) {
            System.out.println("SportsCar IS-A Bus");
        } else {
            System.out.println("SportsCar IS-NOT-A Bus");            
        }
    }    
}



// N.java:5: error: incompatible types: Car cannot be converted to Bus
//         if(x instanceof Bus) {
//            ^
// 1 error