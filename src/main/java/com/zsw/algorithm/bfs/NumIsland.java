package com.zsw.algorithm.bfs;

/**
 * 岛屿数量
 */
public class NumIsland {
    public int numIslands(char[][] grid) {
		int res = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
                    res++;
					bfs(grid, i, j);
				}
			}
		}
		
		return res;
	}
	
	private void bfs(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
			return;
		}
		
		grid[i][j] = '0';
		bfs(grid, i + 1, j);
		bfs(grid, i, j + 1);
		bfs(grid, i - 1, j);
		bfs(grid, i, j - 1);
	}
}
