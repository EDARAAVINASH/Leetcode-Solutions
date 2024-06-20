class Solution {
    public String compressedString(String word) {
        int c=1;
        String output="";
        for(int i=0;i<word.length()-1;i++)
        {
            if(word.charAt(i)==word.charAt(i+1))
            {
                c++;
                if(c==9)
                {
                    output+=""+c+word.charAt(i);
                    c=0;
                }
            }
            else
            {
                if(c>0)
                {
                    output+=""+c+word.charAt(i);
                }
                c=1;
            }
        }
        if(c>0)
        {
            output+=""+c+word.charAt(word.length()-1);
        }
        return output;
    }
}