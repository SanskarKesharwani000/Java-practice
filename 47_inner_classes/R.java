class R {

    class X1 {
        void process() {
            System.out.println(" ++++");
        }
    }
    
    public static void main(String[] args) {
        R o = new R();
        o.process();  // not ok

        // X1 x = o.new X1();
        // x.process();  //ok

    }
}


// R.java:11: error: cannot find symbol
//         o.process();  // not ok
//          ^
//   symbol:   method process()
//   location: variable o of type R
// 1 error
