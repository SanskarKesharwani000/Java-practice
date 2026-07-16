// We cannot override a method which is marked final.

class D1 {
    void pro() {
        System.out.println("pro() in Parent D1");
    }

    final void info() {
        System.out.println("info() in Parent D1");
    }
}


class D extends D1 {
    void pro() {
        System.out.println("pro() in Child class D");
    }

    void info() {
        System.out.println("info() in Child class D");
    }
}




// D.java:17: error: info() in D cannot override info() in D1
//     void info() {
//          ^
//   overridden method is final
// 1 error
