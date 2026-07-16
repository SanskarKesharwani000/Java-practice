// Instance variable cannot be accessed through the static method ie static context

class J {
    int r = 9;

    public static void main(String[] args) {
        J z = new J();        
        
        z.pro();
    }   
    
    static void pro() {
        System.out.println(r);
    }
}


// J.java:11: error: non-static variable r cannot be referenced from a static context
//         System.out.println(r);
//                            ^
// 1 error