import java.util.regex.*;

class E {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("0[xX][0-9a-f][0-9a-f][0-9a-f]");
        // Pattern p = Pattern.compile("0[xX][0-9a-f]{3}");
        Pattern p = Pattern.compile("0[xX][0-9a-f]{2}");

        Matcher m = p.matcher("a5_90x5e27b^eQZ9 w0XtYq12 0xcf92345hG* T50X9h7Y 0X34aY");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        } 
    }
}