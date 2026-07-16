class B1 {
    static void pro(int x) {
        System.out.println("pro() " + x);
    } 

    public static void main(String[] args) {
        
        // ok
        // pro(12);

        // not ok
        // pro();  
        pro(12, 13);
    }    
}


// B1.java:13: error: method pro in class B1 cannot be applied to given types;
//         pro(12, 13);
//         ^
//   required: int
//   found:    int,int
//   reason: actual and formal argument lists differ in length
// 1 error