interface I1 {
    void pro();
}

class I {
    public static void main(String[] args) {
        I1 x = new I1() {
            public void pro() {
                System.out.println("Namaste");
            }
        };

        x.pro();
    }    
}
