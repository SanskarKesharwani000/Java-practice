// We cannot access instance method of another class from object of our class.

class H {
    public static void main(String[] args) {
        H x = new H();

        x.pro();        
    }
}


class H1 {
    void pro() {
        System.out.println("hi");
    }
}



// H.java:5: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type H
// 1 error