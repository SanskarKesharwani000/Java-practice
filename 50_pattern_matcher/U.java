import java.util.regex.*;

class U {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("[abc]");
        Pattern p = Pattern.compile("[abcY]");

        Matcher m = p.matcher("---d---Y---c-----e---a----i---8----b");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}