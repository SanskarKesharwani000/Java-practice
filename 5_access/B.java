// from object of first class we cannot access variable of second class.

class B {
    int x = 21;
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.y);
                
        System.out.println(a.x);
    }
}

class B1 {
    int y = 99;
}



// B.java:6: error: cannot find symbol
//         System.out.println(a.y);
//                             ^
//   symbol:   variable y
//   location: variable a of type B
// 1 error