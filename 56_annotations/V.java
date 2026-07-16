import java.util.Date;

class V {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date date = new Date(2021, 9, 11);

        System.out.println(date);
    
        @SuppressWarnings("removal")
        Boolean flag = new Boolean(true);

        System.out.println(flag);
    }    
}


// V.java:11: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
//         Boolean flag = new Boolean(true);
//                        ^
// 1 warning
