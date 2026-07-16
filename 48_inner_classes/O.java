class O {
    int t = 9;
    void pro() {
        class Z1 {
            static void info() {
                System.out.println(t);
            }
        }

        // Z1.info();
    }    

    public static void main(String[] args) {
        
    }
}


// O.java:6: error: non-static variable t cannot be referenced from a static context
//                 System.out.println(t);
//                                    ^
// 1 error
