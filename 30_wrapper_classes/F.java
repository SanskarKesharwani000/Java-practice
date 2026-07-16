class F {
    public static void main(String[] args) {
        Byte a = 230;

        Short b = 45000;

        Character c = -1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}


// F.java:3: error: incompatible types: int cannot be converted to Byte
//         Byte a = 230;
//                  ^
// F.java:5: error: incompatible types: int cannot be converted to Short
//         Short b = 45000;
//                   ^
// F.java:7: error: incompatible types: int cannot be converted to Character
//         Character c = -1;
//                       ^
// 3 errors