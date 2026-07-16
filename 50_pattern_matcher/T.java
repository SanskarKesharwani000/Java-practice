import java.util.regex.*;

class T {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w");

        Matcher m = p.matcher("----r------Y-----8-------_-------$---^------#-");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}