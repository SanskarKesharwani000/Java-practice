import java.util.regex.*;

class R {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("\\d\\d");
        Pattern p = Pattern.compile("\\d\\d\\d");

        Matcher m = p.matcher("my age 23 and my score 754 my rank is 9");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}