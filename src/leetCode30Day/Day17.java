package leetCode30Day;

public class Day17 {
	public static void main(String[] args) {
		char[][] grid = { 
				{ '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		int result = numIslands(grid);
		System.out.println(result);

	}

	public static int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					findIslands(grid, i, j);
					count++;
				}
			}
		}

		return count;
	}

	public static void findIslands(char[][] grid, int row, int col) {
		if (0 <= row && row < grid.length && 0 <= col && col < grid[0].length && grid[row][col] == '1') {
			System.out.println(row+" "+col);
			grid[row][col] = 'v';
			findIslands(grid, row, col - 1);
			findIslands(grid, row, col + 1);
			findIslands(grid, row - 1, col );
			findIslands(grid, row + 1, col);
		}
	}
}
