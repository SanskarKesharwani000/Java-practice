class E {
    public static void main(String[] args) {
        Integer c = new Integer(14);
        Long d = new Long(15);
        Float e = new Float(16);
        
        process(c);
        process(d);
        process(e);
    }   
    
    static void process(Integer var) {
        //some numeric operations...
    }
}



// E.java:8: error: incompatible types: Long cannot be converted to Integer
//         process(d);
//                 ^
// E.java:9: error: incompatible types: Float cannot be converted to Integer
//         process(e);