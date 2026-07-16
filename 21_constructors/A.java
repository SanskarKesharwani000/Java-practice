class A {
    public static void main(String[] args) {
        A x = new A();

        System.out.println(x.abc);

        x.mno();
    }
}


// A.java:5: error: cannot find symbol
//         System.out.println(x.abc);
//                             ^
//   symbol:   variable abc
//   location: variable x of type A
// A.java:7: error: cannot find symbol
//         x.mno();
//          ^
//   symbol:   method mno()
//   location: variable x of type A
// 2 errors