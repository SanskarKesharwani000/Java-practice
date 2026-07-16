import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        // Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("my friend om is a good guy. om is in class 12th and om is a good singer");

        if(m.find())
            System.out.println("if result : " + m.group());
        else
            System.out.println("else result : no match found...");
    }
}