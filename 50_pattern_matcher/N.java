import java.util.regex.*;

class N {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aaa");

        Matcher m = p.matcher("aaaaaaaaaa");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}
