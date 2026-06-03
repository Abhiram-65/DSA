// DFS of Graph - Recursive Approach
class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = adj.size();
        boolean vis[] = new boolean[n];
        dfs1(0, adj, vis, res);
        return res;
       
    }
    static void dfs1(int s,ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> res){
        vis[s] = true;
        res.add(s);
        for(int v : adj.get(s)){
            if(vis[v] == false){
                dfs1(v, adj, vis, res);
            }
        }
    }
}
