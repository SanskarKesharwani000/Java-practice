class S {
    private int w = 123;

    class X1 {
        private void process() {
            System.out.println(w + " ++++");
        }
    }
    
    public static void main(String[] args) {
        S o = new S();

        X1 x = o.new X1();

        System.out.println(x.w);
    }
}


// S.java:15: error: cannot find symbol
//         System.out.println(x.w);
//                             ^
//   symbol:   variable w
//   location: variable x of type S.X1
// 1 error