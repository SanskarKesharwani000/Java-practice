import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

        // Matcher m = p.matcher("------ mahendrabahubali@mahishmati.com ------------------ om@tcs.com ------ maheshbabu@gov.nic.in -----");
        Matcher m = p.matcher("mahendrabahubali@mahishmati.com");         

        // System.out.println(m.matches());
        System.out.println(m.find());
        System.out.println(m.group());
    }
}