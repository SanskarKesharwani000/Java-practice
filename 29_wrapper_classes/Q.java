class Q {
    public static void main(String[] args) {
        Short x = Short.valueOf(23);
    }    
}


// Q.java:3: error: no suitable method found for valueOf(int)
//         Short x = Short.valueOf(23);
//                        ^
//     method Short.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
//     method Short.valueOf(short) is not applicable
//       (argument mismatch; possible lossy conversion from int to short)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error