class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] bef=before(heights,n);
        int[] aft=after(heights,n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int a=((aft[i]-bef[i])-1)*heights[i];
            max=Math.max(max,a);
        }
        return max;
    }
    public static int[] before(int[] heights,int n)
    {
        Stack<Integer> st=new Stack();
        int[] bef=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                bef[i]=st.peek();
            }
            else
            {
                bef[i]=-1;
            }
             st.push(i);
        }
        return bef;
    }
    public static int[] after(int[] heights,int n)
    {
        Stack<Integer> st=new Stack();
        int[] aft=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                aft[i]=st.peek();
            }
            else
            {
                aft[i]=n;
            }
            st.push(i);
        }
        return aft;
    }
}