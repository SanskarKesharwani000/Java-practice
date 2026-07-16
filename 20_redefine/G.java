class G1 {

}

class G extends G1 {
    void abc() {
        int n = 90;
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        G x = new G();
        
        x.abc();
    }
}
