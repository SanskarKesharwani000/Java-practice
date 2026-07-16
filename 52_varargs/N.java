class N {
    static void pro(String name, int... marks) {
        System.out.println(name);

        for(int next : marks)
            System.out.println(next);
    }

    public static void main(String[] args) {
        // ok
        // pro("Gopal", 67, 78, 56, 98);
        // pro("Gopal");
        
        // not ok
        pro(67, 78, 56, 98);
    }    
}


// N.java:13: error: incompatible types: int cannot be converted to String
//         pro(67, 78, 56, 98);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error