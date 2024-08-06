class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) 
        {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) 
        {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        boolean[] vis=new boolean[n];
        while(!queue.isEmpty())
        {
            int num=queue.poll();
            if(num==destination) return true;
            for(int i:adj[num])
            {
                if(!vis[i])
                {
                    queue.add(i);
                    vis[i]=true;
                }
            }
        }   
        return false;
    }
}