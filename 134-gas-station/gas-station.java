class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int totgas=0,totcost=0,currtank=0,startindex=0;
        for(int i=0;i<gas.length;i++)
        {
            totgas+=gas[i];
            totcost+=cost[i];
            currtank+=gas[i]-cost[i];
            if(currtank<0) 
            {
                startindex=i+1;
                currtank=0;
            }
        }
        if(totgas>=totcost)
        {
            return startindex;
        }
        return -1;
    }
}