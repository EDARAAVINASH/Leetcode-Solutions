class Solution {
    public int passThePillow(int n, int time) {
        int pre=1,count=1;
        boolean b=true;
        while(pre<=time)
        {
            if(count==1) b=true;
            else if(count==n) b=false;
            if(b)
            {
                count++;
            }
            else
            {
                count--;
            }
            pre++;
        }
        return count;
    }
}