// local level variable cannot be accessed from the object of that class.

class Q {

    public static void main(String[] args) {
        Q q = new Q();
        int y = 90;
        System.out.println(q.y);
    }    
}


// Q.java:8: error: cannot find symbol
//         System.out.println(q.y);
//                             ^
//   symbol:   variable y
//   location: variable q of type Q
// 1 error
