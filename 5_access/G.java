// instance method of another class is not accessible in our class directly

class G {
    public static void main(String[] args) {
        pro();
    }    
}

class G1 {
    void pro() {
        System.out.println("Hello");
    }
}


// G.java:3: error: cannot find symbol
//         pro();
//         ^
//   symbol:   method pro()
//   location: class G
// 1 error