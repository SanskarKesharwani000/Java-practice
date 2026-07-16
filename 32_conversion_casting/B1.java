class B1 {
    public static void main(String[] args) {
        int y = 2;

        byte x = y;

        System.out.println(x);
    }    
}


// B1.java:5: error: incompatible types: possible lossy conversion from int to byte    
//         byte x = y;
//                  ^
// 1 error