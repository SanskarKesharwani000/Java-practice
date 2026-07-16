class C2 {
    public static void main(String[] args) {
        int y = 7;

        short x = y;

        System.out.println(x);
    }    
}

// C2.java:5: error: incompatible types: possible lossy conversion from int to short
//         short x = y;
//                   ^
// 1 error