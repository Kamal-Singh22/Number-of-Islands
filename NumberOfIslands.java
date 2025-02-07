public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        // Edge case: if grid is null or empty
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        // Iterate over each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // When a land cell is found, perform DFS to mark the entire island
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    // Depth-First Search to mark visited land cells
    private static void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Base conditions: check boundaries and if the cell is water
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        
        // Mark the current cell as visited by setting it to '0'
        grid[i][j] = '0';
        
        // Explore all 4 adjacent cells: up, down, left, right
        dfs(grid, i + 1, j);  // Down
        dfs(grid, i - 1, j);  // Up
        dfs(grid, i, j + 1);  // Right
        dfs(grid, i, j - 1);  // Left
    }

    public static void main(String[] args) {
        // Sample grid input
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        
        int numberOfIslands = numIslands(grid);
        System.out.println("Number of Islands: " + numberOfIslands); // Expected Output: 3
    }
}
