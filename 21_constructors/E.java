class E {
    E() {
        // the constructor code will run, whenever you create an object of class E
        System.out.println("Hi");
    } 
    
    public static void main(String[] args) {
        System.out.println("----------- 1");
        E a = new E();
        E b = new E();
        E c = new E();
        System.out.println("----------- 2");
    }
}
