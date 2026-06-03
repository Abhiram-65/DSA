//DFS of Graph
class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = adj.size();
        
        boolean vis[] = new boolean[n];
        vis[0] = true;
       
        res.add(0);

        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        while(!st.isEmpty()){
            int u = st.peek();
            int flag = 0;
            
            for(int v : adj.get(u)){
                flag = 0;
                
                if(vis[v] == false){
                    vis[v] = true;
                    res.add(v);
                    st.push(v);
                    
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                st.pop();
            }
        }
        return res;
    }
}
