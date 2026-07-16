// Instance variable cannot be accessed through the class name ie static context

class G {
    int y = 34;
    public static void main(String[] args) {
        System.out.println(G.y);
    }    
}


// G.java:4: error: non-static variable y cannot be referenced from a static context
//         System.out.println(G.y);
//                             ^
// 1 error
