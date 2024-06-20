class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
            int oc=0,cc=0,idx=0;
            List<String> s=new ArrayList<>();
            char[] p=new char[2*n];
            bp(oc,cc,idx,n,p,s);
            return s;
    }
    public static void bp(int oc,int cc,int idx,int n,char[] p,List<String> s)
    {
        if(idx==2*n)
        {
            for(char c:p)
            {
                System.out.print(c);
            }
            s.add(new String(p));
        }
        if(oc<n)
        {
            p[idx]='(';
            bp(oc+1,cc,idx+1,n,p,s);
        }
        if(oc>cc)
        {
            p[idx]=')';
            bp(oc,cc+1,idx+1,n,p,s);
        }
    }
}