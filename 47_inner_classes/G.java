class G {
    class Y {
        Y() {
            System.out.println("Inside Constructor Y()");
        }
    }
    
    public static void main(String[] args) {
        G x = new G();

        Y y = x.new Y();
    }    
}
