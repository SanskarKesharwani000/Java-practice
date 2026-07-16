// static variable should be marked final because it's value is never changed.

class V1 {
    final static int y = 80;
    
    public static void main(String[] args) {
        System.out.println(y);
    }
}
