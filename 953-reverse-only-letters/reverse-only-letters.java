class Solution {
    public String reverseOnlyLetters(String s) 
    {
        int len=s.length();
        int l=0,r=len-1;   
        char[] let=s.toCharArray();
        while(l<r)
        {
            if(Character.isLetter(let[l]) && Character.isLetter(let[r]))
            {
                char temp=let[l];
                let[l]=let[r];
                let[r]=temp;
                l++;
                r--;
            }
            else 
            {
                if(!Character.isLetter(let[l])) l++;
                if(!Character.isLetter(let[r])) r--;
            }
        } 
        return new String(let);
    }
}