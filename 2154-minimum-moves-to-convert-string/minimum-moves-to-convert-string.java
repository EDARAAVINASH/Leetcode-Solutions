class Solution {
    public int minimumMoves(String s) 
    {
        int answer=0,i=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(c=='X')
            {
                answer++;
                i=i+3;
            }
            else
            {
                i++;
            }
        }
        return answer;    
    }
}