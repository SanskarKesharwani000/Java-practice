class F {
    public static void main(String[] args) {
        Byte x = Byte.valueOf(45);
    }    
}


// F.java:3: error: no suitable method found for valueOf(int)
//         Byte x = Byte.valueOf(45);
//                      ^
//     method Byte.valueOf(byte) is not applicable
//       (argument mismatch; possible lossy conversion from int to byte)
//     method Byte.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error