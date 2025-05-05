import static java.io.IO.println;

public int minPathSum(int[][] grid) {
    int M = grid.length;
    int N = grid[0].length;

    int[][] res = new int[M][N];
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            res[i][j] = 0;
        }
    }

    return helperFunction(M - 1, N - 1, grid, res);
}

int helperFunction(int i, int j, int[][] grid, int[][] res) {


    if (i == 0 && j == 0)
        return grid[i][j];

    if (i == -1 || j == -1)
        return Integer.MAX_VALUE;

    if (res[i][j] != 0)
        return res[i][j];

    res[i][j] = grid[i][j] + Math.min(helperFunction(i, j - 1, grid, res),
            helperFunction(i - 1, j, grid, res));

    return res[i][j];
}

void main() {
    int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    println(minPathSum(grid));
}
