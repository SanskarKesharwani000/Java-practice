// We cannot access instance level variable in static method ie static context directly.

class F {
    int y = 78;
    public static void main(String[] args) {
        System.out.println(y);
    }    
}



// F.java:4: error: non-static variable y cannot be referenced from a static context
//         System.out.println(y);
//                            ^
// 1 error
