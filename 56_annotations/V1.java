import java.util.Date;
import java.util.ArrayList;

class V1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date date = new Date(2021, 9, 11);

        System.out.println(date);
    
        @SuppressWarnings("removal")
        Boolean flag = new Boolean(true);

        System.out.println(flag);

        ArrayList x = new ArrayList();

        x.add("mohan");
    }    
}


// Note: W.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.