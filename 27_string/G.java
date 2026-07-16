class G {
    public static void main(String[] args) {
        System.out.println(args instanceof String);
        System.out.println(args[0] instanceof String[]);

        System.out.println(args instanceof String[]);
        System.out.println(args[0] instanceof String);
    }    
}



// G.java:3: error: incompatible types: String[] cannot be converted to String
//         System.out.println(args instanceof String);
//                            ^
// G.java:4: error: incompatible types: String cannot be converted to String[]
//         System.out.println(args[0] instanceof String[]);
//                                ^
// 2 errors