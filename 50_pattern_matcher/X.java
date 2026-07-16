import java.util.regex.*;

class X {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[j-s]");

        Matcher m = p.matcher("---n---d----i----l-----y----q----");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}