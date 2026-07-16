interface L1 {
    void pro(int x, float y);
}

// class L2 implements L1 {
//     public void pro(int a, float b) {
//         System.out.println(a + " Salamalaikum " + b);
//     }
// }

// (a, b) -> System.out.println(a + " Salamalaikum " + b);


class L {
    public static void main(String[] args) {
        // L1 x = new L2();
        L1 x = (a, b) -> System.out.println(a + " Kemcho " + b);

        x.pro(45, 2.3f);
    }
}
