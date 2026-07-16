// We cannot use Collection classes without importing it.

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x.size());
    }
}


// A.java:3: error: cannot find symbol
//         ArrayList x = new ArrayList();
//         ^
//   symbol:   class ArrayList
//   location: class A
// A.java:3: error: cannot find symbol
//         ArrayList x = new ArrayList();
//                           ^
//   symbol:   class ArrayList
//   location: class A
// 2 errors