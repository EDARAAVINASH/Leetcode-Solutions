import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        p = preprocessPattern(p);
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private String preprocessPattern(String p) {
        p = p.replaceAll("\\*+", "*");
        if (p.startsWith("*")) {
            p = p.substring(1);
        }
        return p;
    }
}