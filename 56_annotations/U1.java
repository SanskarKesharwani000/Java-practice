import java.util.Date;

class U1 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date date = new Date(2021, 9, 11);

        System.out.println(date);
    }    
}