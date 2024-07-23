class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(char c:s.toCharArray()){
            if(letter==c){
                count++;
            }
        }
        int ct=count*100;
        return ct/s.length();
    }
}