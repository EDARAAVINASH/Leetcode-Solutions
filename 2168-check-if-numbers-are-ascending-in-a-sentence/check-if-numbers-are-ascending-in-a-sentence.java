class Solution {
    public boolean areNumbersAscending(String s) 
    {
        int prev=0;
        String[] str=s.split(" ");
        for(String var:str)
        {
            if(Character.isDigit(var.charAt(0)))
            {
                int num=Integer.parseInt(var);
                if(num<=prev)
                    return false;
                prev=num;
            }
        } 
        return true;  
    }
}