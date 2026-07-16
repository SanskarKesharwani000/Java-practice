class D {
    // instance level member method  of it's container class(D) 
    void process() {
        System.out.println("Some Method");
    }
    
    public static void main(String[] args) {
        process();
    }    
}


// D.java:7: error: non-static method process() cannot be referenced from a static context
//         process();
//         ^
// 1 error
