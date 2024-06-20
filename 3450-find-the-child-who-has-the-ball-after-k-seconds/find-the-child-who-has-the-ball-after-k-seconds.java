class Solution {
    public int numberOfChild(int n, int k) {
        int s=0,e=n-1,pos=0;
        boolean b=true;
        for(int i=0;i<k;i++)
        {
            if(b)
            {
                pos++;
                if(pos==n-1)
                {
                    b=false;
                }
            }
            else
            {
                pos--;
                if(pos==0)
                {
                    b=true;
                }
            }
        }
        return pos;
    }
}