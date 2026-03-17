class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<V; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        int[] parent = new int[V];
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                q.add(i);
                visited[i] = true;
                parent[i] = -1;
                while(q.isEmpty() == false){
                    int curr = q.poll();
                for(int x : list.get (curr)){
                    if(visited[x] == false){
                        q.add(x);
                        parent[x] = curr;
                        visited[x] = true;
                    }else{
                        if(parent[curr] != x){
                            return true;
                        }
                    } 
                }
            }
                }
        }
        return false;
    }
}