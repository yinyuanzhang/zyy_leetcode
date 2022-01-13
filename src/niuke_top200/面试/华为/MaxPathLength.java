package niuke_top200.面试.华为;

public class MaxPathLength {



    public int maxPathLength(int[][] arr){
        if(arr.length == 0) return 0;

        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < m; i++) {
            dp[0][i] += sum1;
            sum1 += arr[0][i];
        }

        for(int j = 0; j < n; j++){
            dp[j][0] += sum2;
            sum2 += arr[j][0];
        }

        for (int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++){
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        return dp[n - 1][m - 1];
    }



    public int maxPathLength2(int[][] arr){
        if(arr.length == 0) return 0;

        int n = arr.length;
        int m = arr[0].length;

        int[] dp = new int[m];
        int sum = arr[0][0];
        for (int i = 0; i < m; i++) {
            dp[i] += sum;
            sum += arr[0][i];
        }

        int maxLenth = 0;

        for (int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++){
                dp[j] = Math.max(dp[j - 1], dp[j]) + arr[i][j];
            }
        }
        return dp[m - 1];
    }

}
