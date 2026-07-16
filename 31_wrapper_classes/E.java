class E {
    public static void main(String[] args) {
        int x = 89;

        String y = x.toString();

        System.out.println(x + 1);
        System.out.println(y + 1);
    }    
}


// E.java:5: error: int cannot be dereferenced
//         String y = x.toString();
//                     ^
// 1 error