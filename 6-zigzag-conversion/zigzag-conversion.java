class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows==1) return s;
        int length=s.length();
        boolean dir=true;
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();
        }
        int curr=0;
        for(char c:s.toCharArray())
        {
            rows[curr].append(c);
            if(curr==0) 
            {
                dir=true;
            }
            if(curr==numRows-1)
            {
                dir=false;
            }
            if(dir)
            {
                curr++;
            }
            else
            {
                curr--;
            }
        }
        StringBuilder fin=new StringBuilder();
        for(StringBuilder sb:rows)
        {
            fin.append(sb);
        }
        return fin.toString();
    }
}