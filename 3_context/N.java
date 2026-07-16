// We can access instance method through object of that class.

class N {
    int t = 9;
    
    void pro() {

    }

    void info() {
        System.out.println(t);
        pro();
    }

    public static void main(String[] args) {
        N a = new N();
        
        a.info();        
    }
}
