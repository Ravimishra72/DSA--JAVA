class Solution {
    public void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        grid[i][j] = '0';
        int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            for (int[] d : dir) {
                int u = curr[0] + d[0];
                int v = curr[1] + d[1];
                if (u >= 0 && v >= 0 && u < grid.length && v < grid[0].length && grid[u][v] == '1') {
                    q.add(new int[] { u, v });
                    grid[u][v] = '0';
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}