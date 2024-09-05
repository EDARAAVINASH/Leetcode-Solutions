class Solution {
    public int countOdds(int low, int high) 
    {
        int odds=0;
        boolean b1=low%2==1?true:false;
        boolean b2=high%2==1?true:false;
        if(b1 || b2)
        {
            return (high-low)/2+1;
        }    
        // else if(b1 || b2)
        // {
        //     return ()
        // }
        return (high-low)/2;
    }
}