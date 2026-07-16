class F {
    public static void main(String[] args) {
        Integer c = new Integer(14);
        Long d = new Long(15);
        Float e = new Float(16);
        
        process(c);
        process(d);
        process(e);
    }   
    
    static void process(Integer var) {
        System.out.println("process(Integer)");
        //some numeric operations...
    }
    
    static void process(Float var) {
        System.out.println("process(Float)");
        //some numeric operations...
    }
    
    static void process(Long var) {
        System.out.println("process(Long)");
        //some numeric operations...
    }
}
