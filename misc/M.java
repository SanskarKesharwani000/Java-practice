class M {
    public static void main(String[] args) {
        int q = pro();

        System.out.println(q);
    }   
    
    static void pro() {
        return;
    }

    // static int pro() {
    //     return 121;
    // }
}


// M.java:3: error: incompatible types: void cannot be converted to int
//         int q = pro();
//                    ^
// 1 error
