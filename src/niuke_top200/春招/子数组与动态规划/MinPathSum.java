package niuke_top200.春招.子数组与动态规划;

public class MinPathSum {


    public static void main(String[] args) {

    }

    public static int minPathSum(int[][] arr){

        // write code here
        if(arr.length == 0) return 0;
        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];

        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }

        for (int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        return dp[n - 1][m - 1];
    }


//    public int minPathSum(int[][] arr) {
//        if(arr.length == 0) return 0;
//
//        int n = arr.length;
//        int m = arr[0].length;
//
//        int[] dp = new int[m + 1];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//        dp[1] = 0;
//
//        for (int i = 1; i <= n; i++) {
//            for(int j = 1; j <= m; j++){
//                dp[j] = Math.min(dp[j - 1], dp[j]) + arr[i - 1][j - 1];
//            }
//        }
//        return dp[m];
//    }
}



