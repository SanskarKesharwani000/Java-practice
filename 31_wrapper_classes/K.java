class K {
    public static void main(String[] args) {
        Integer x = 2;

        // <wrapper-class-object> + <primitive int>
        // unboxing will return a primitive value, now the primitive arithmetic opration will be performed... 
        System.out.println(x + 2);

        //or
        // int c = (x + 1).intValue();
    }    
}
