class T {
    static void pro(String...... y) {

    }    

    public static void main(String[] args) {
        String[][] x = new String[][] {
                                        {"A","B","C","D", "E"}, 
                                        {"1", "2", "3", "4"}, 
                                        {"a","b", "c"}
                                    };
        
        pro(x);
    }    
}


// T.java:2: error: <identifier> expected
// static void pro(String...... y) {
//                          ^
// 1 error
