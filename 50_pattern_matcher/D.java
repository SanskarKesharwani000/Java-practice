import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");

        Matcher m = p.matcher("my friend om is a good guy. om is in class 12th and om is a good singer");

        System.out.println(m.find());
        System.out.println(m.group());
    }
}


// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at D.main(D.java:11)