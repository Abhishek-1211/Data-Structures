import static java.io.IO.println;
/*
Unique paths[62]
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach
the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.
*/
void main(){
    int m=5,n =5;
    println(uniquePaths(m,n));

}

int uniquePaths(int m, int n){

    int[][] cache = new int[m][n];
    for(int i=0; i<m;i++){
        for(int j=0;j<n;j++){
            cache[i][j]=-1;
        }
    }

    cache[0][0]=1;
    int ans = uniquePathsUtil(m-1,n-1,cache);
    return ans;
}

int uniquePathsUtil(int m, int n, int[][]cache){
    if(m==-1||n==-1)
        return 0;

    if(cache[m][n]!=-1)
        return cache[m][n];

    cache[m][n]=uniquePathsUtil(m-1,n,cache)+uniquePathsUtil(m,n-1,cache);

    return cache[m][n];

}