class G {
    void pro() {
        System.out.println(this);
    }
    
    //not ok
    static void info() {
        System.out.println(this);
    }
}
