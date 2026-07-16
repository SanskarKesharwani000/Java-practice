class S {
    public static void main(String[] args) {
        Object x = 34;  // Boxing then conversion is allowed...

        System.out.println(x); // Dynamic Method Dispatch(Runtime Polymorphism)
       
        x = 3.4;
       
        System.out.println(x); // Dynamic Method Dispatch(Runtime Polymorphism)
    }    
}
