import java.util.regex.*;

class W {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^abcY]");

        Matcher m = p.matcher("dYceai8b");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}