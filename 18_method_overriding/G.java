class G1 {
    static void pro() {
        System.out.println("Yamraj");
    }
}

class G extends G1 {
    static void pro() {
        System.out.println("Dharamraj");
    }
    
    public static void main(String[] args) {
        // G1 x = new G1();
        // x.pro();

        // G x = new G();
        // x.pro();

        G1 x = new G();
        x.pro();
    }    
}
