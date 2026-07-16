class H1 {

}

class H extends H1 {
    int n = 23;

    void abc() {
        // int n = 90;
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        H x = new H();
        
        x.abc();
    }
}
