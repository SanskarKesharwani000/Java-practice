class J {
    J() {
        System.out.println(this + " ------------ ##");
    }
    
    public static void main(String[] args) {
        J a = new J();
        System.out.println(a + " ------------ ##");

        J b = new J();
        System.out.println(b + " ------------ ##");
    }    
}
