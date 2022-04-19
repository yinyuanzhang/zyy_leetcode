package niuke_top200.春招.回溯;

public class IsolateNum {

    public static void main(String[] args) {

    }

    public int isolateNum(char[][] grid){
        if(grid.length == 0) return 0;

        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == '1'){
                    num++;
                    dfs(grid, i, j);
                }

            }
        }
        return num;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;    // 这个范围写法要注意
        if (grid[i][j] == '0') return;
        else {
            grid[i][j] = '0';    // grid放置的位置很有讲究   如果放置到结束会导致无限循环。左 右 左 右
            dfs(grid, i, j - 1);
            dfs(grid, i, j + 1);
            dfs(grid, i - 1, j);
            dfs(grid, i + 1, j);
        }
    }
}
