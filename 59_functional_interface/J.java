interface J1 {
    void info();
}

// class J2 implements J1 {
    // public void info() {
    //     System.out.println("Wadakkam");
    // }
// }

// () -> System.out.println("Wadakkam");


class J {
    public static void main(String[] args) {
        // J1 x = new J2();
        
        // J1 x = new J1() {
        //     public void info() {
        //         System.out.println("good Morning");
        //     }
        // };

        J1 x = () -> System.out.println("nihao");

        x.info();
    }
}