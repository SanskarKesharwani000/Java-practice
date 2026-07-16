class U {
    int y = 11;

    class X1 {
        static void process() {
            System.out.println(y);
        }
    }    
}


// U.java:6: error: non-static variable y cannot be referenced from a static context
//             System.out.println(y);
//                                ^
// 1 error