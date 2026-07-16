class L {
    int aa = 99;
    static int bb = 55;

    static void pro() {        
        class X1 {
            void info() {
                System.out.println(aa);
                System.out.println(bb);
            }
        }

        X1 x = new X1();

    }   
    
    public static void main(String[] args) {
        L.pro();
    }
}


// L.java:8: error: non-static variable aa cannot be referenced from a static context
//                 System.out.println(aa);
//                                    ^
// 1 error
