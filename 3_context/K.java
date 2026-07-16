// static variable can be referenced from the static method ie static context

class K {
    static int r = 9;

    public static void main(String[] args) {       
        
        pro();
    }   
    
    static void pro() {
        System.out.println(r);
    }
}
