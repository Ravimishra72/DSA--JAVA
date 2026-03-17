class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[adj.size()];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            for(int x : adj.get(curr)){
                if(visited[x] == false){
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
        return ans;
    }
}