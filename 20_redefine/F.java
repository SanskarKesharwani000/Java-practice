class F1 {

}

class F extends F1 {
    void abc() {
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        F x = new F();
        
        x.abc();
    }
}


// F.java:7: error: cannot find symbol
//         System.out.println(n);
//                            ^
//   symbol:   variable n
//   location: class F
// 1 error