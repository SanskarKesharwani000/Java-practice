// instance variable and instance method cannot be accessed from the class name.

class M {
    int y = 9;

    public static void main(String[] args) {
        System.out.println(M.y);

        M.pro();
    }   
    
    void pro() {
        System.out.println("Hello");
    }
}


// M.java:5: error: non-static variable y cannot be referenced from a static context
//         System.out.println(M.y);
//                             ^
// M.java:7: error: non-static method pro() cannot be referenced from a static context
//         M.pro();
//          ^
// 2 errors