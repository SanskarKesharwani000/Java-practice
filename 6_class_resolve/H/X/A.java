// if file is in different folder then without importing we cannot access it and without making it public we cannot access it.

class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);
    }    
}


// A.java:3: error: cannot find symbol
//         B x = new B();
//         ^
//   symbol:   class B
//   location: class A
// A.java:3: error: cannot find symbol
//         B x = new B();
//                   ^
//   symbol:   class B
//   location: class A
// 2 errors