// We cannot use variable of another class in our file without using its class.

class L {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(E);

        int y = min(34, 56);

        System.out.println(y);
    }    
}


// L.java:3: error: cannot find symbol
//         System.out.println(PI);
//                            ^
//   symbol:   variable PI
//   location: class L
// L.java:4: error: cannot find symbol
//         System.out.println(E);
//                            ^
//   symbol:   variable E
//   location: class L
// L.java:6: error: cannot find symbol
//         int y = min(34, 56);
//                 ^
//   symbol:   method min(int,int)
//   location: class L
// 3 errors