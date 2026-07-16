import java.util.regex.*;

class K {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile(".*XX");
        Pattern p = Pattern.compile(".*?XX");

        Matcher m = p.matcher("ayt2XX_79D2kXX8787");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        } 
    }
}