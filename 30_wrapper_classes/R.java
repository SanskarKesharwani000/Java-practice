class R {
    public static void main(String[] args) {
        Float a = new Float(2.3f);
        Float b = Float.valueOf(2.3f);
        Float c = 2.3f;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }    
}
