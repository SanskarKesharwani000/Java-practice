class D1 {
    public static void main(String[] args) {
        int w = 65;
        char x = w;

        System.out.println((int)x);
    }    
}


// D1.java:4: error: incompatible types: possible lossy conversion from int to char
//         char x = w;
//                  ^
// 1 error