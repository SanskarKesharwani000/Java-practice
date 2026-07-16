class C {
    // instance level variable member of it's container class(C)
    int abc = 97;
    
    public static void main(String[] args) {
        System.out.println(abc);
    }    
}


// C.java:5: error: non-static variable abc cannot be referenced from a static context
//         System.out.println(abc);
//                            ^
// 1 error
