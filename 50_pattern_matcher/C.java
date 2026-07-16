import java.util.regex.Pattern;
import java.util.regex.Matcher;

class C {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("my friend om is a good guy. om is in class 12th and om is a good singer");

        // m.find();
        System.out.println(m.group());
    }
}


// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at C.main(C.java:11)