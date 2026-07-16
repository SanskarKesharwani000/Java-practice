import java.util.regex.*;

class V {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("om");
        Pattern p = Pattern.compile(" om ");

        Matcher m = p.matcher("my friend om is a good guy. vyomkesh is in class 12th and omkar is a good singer");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}