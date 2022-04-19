package niuke_top200.春招.动态规划;

public class MinPathSum {


    // 二维写法，直观易懂，因为初始化比较简单就没有扩大一般式的范围。
    public int minPathSumByTwoDimArray(int[][] array){
        // dp[i][j]代表(i，j)处的路径最小总和   dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
        if(array == null) return 0;
        int m = array.length;
        int n = array[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = array[0][0];
        for(int j = 1; j < n; j++){
            dp[0][j] = dp[0][j - 1] + array[0][j];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + array[i][0];
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + array[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    // 没有扩大一般式的应用范围，对不符合初始化范围的值自行处理。   //这种写法没有下一种好，不写成一般式还要单独对某种结果处理容易出问题
    public int minPathSumByOneDimArray(int[][] array){

        if(array == null) return 0;
        int m = array.length;
        int n = array[0].length;
        int[] dp = new int[n];

        dp[0] = array[0][0];
        for(int j = 1; j < n; j++){
            dp[j] = dp[j - 1] + array[0][j];
        }

        int tag = array[0][0];
        for(int i = 1; i < m; i++){
            tag += array[i][0];
            for(int j = 1; j < n; j++){
                if(j == 1){
                    dp[j] = Math.min(dp[j], tag) + array[i][j];
                }else{
                    dp[j] = Math.min(dp[j], dp[j - 1]) + array[i][j];
                }
            }
        }
        return dp[n - 1];
    }


    // 扩大了一般式的应用范围，因此注意初始化时不单独处理边界条件，而是赋值使得边界条件满足一般式。
    public int minPathSumByOneDimArray2(int[][] array) {

        if(array == null) return 0;
        int m = array.length;
        int n = array[0].length;
        int[] dp = new int[n + 1];
        for(int j = 1; j <= n; j++){
            dp[j] = dp[j - 1] + array[0][j - 1];
        }
        dp[0] = Integer.MAX_VALUE;
        for(int i = 2; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[j] = Math.min(dp[j - 1], dp[j]) + array[i - 1][j - 1];
            }
        }
        return dp[n];
    }
}
