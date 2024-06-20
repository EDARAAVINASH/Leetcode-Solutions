class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int zeros=0,ones=0;
        for(char c:s.toCharArray())
        {
            if(c=='1')
            {
                ones++;
            }
            else
            {
                zeros++;
            }
        }
        while(ones-->1)
        {
            sb.append("1");
        }
        while(zeros-->0)
        {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}