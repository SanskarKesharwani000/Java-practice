import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("my friend om is a good guy. om is in class 12th and om is a good singer");

        System.out.println(p); 
        System.out.println(m); 
    }
}