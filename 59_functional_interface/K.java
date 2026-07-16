interface K1 {
    void pro(int x);
}

// class K2 implements K1 {
//     public void pro(int x) {
//         System.out.println("Hi - " + x);
//     }
// }

// x -> System.out.println("Hi - " + x);


class K {
    public static void main(String[] args) {
        // K1 x = new K2();

        K1 x = y -> System.out.println("Hiiiii... - " + y);

        x.pro(23);
    }
}
