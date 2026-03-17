class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean 
    visited[],ArrayList<Integer> ans){
        ans.add(s);
        visited[s] = true;
        for(int x : adj.get(s)){
            if(visited[x] == false){
                dfs(adj,x,visited,ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] = new boolean[adj.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(adj,0,visited,ans);
        return ans;
    }
}