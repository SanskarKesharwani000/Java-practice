class T2 {
    static void pro(String...[] y) {
        for(String[] next : y) {
            for(String nx : next)
                System.out.print(nx + " ");

            System.out.println();
        }
    }    

    public static void main(String[] args) {
        String[][] x = new String[][] {
                                        {"A","B","C","D", "E", "F"}, 
                                        {"1", "2", "3", "4"}, 
                                        {"a","b", "c"},
                                        {"7", "8"}
                                    };
        
        pro(x);
    }    
}


// T2.java:2: error: <identifier> expected
//     static void pro(String...[] y) {
//                              ^
// T2.java:2: error: ',', ')', or '[' expected
//     static void pro(String...[] y) {
//                                ^
// 2 errors