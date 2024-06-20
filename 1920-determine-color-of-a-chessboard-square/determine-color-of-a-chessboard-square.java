class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c=coordinates.charAt(0);
        char d=coordinates.charAt(1);
        if(("aceg".contains(String.valueOf(c)) && Integer.valueOf(d)%2==0) ||
        "bdfh".contains(String.valueOf(c)) && Integer.valueOf(d)%2!=0)
        {
            return true;
        }
        return false;
    }
}