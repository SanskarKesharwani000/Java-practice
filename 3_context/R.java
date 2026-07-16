// local level variable cannot be accessed through the class name of that class.

class R {

    public static void main(String[] args) {
        int y = 90;
        System.out.println(R.y);
    }    
}


// R.java:5: error: cannot find symbol
//         System.out.println(R.y);
//                             ^
//   symbol:   variable y
//   location: class R
// 1 error