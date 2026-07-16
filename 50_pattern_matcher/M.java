import java.util.regex.Pattern;
import java.util.regex.Matcher;

class M {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("my friend mohan is a good guy...");

        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.pattern());
        System.out.println(m.pattern());
    }
}
