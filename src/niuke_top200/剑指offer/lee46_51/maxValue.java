package niuke_top200.剑指offer.lee46_51;

public class maxValue {

    public static void main(String[] args) {

    }


    public int maxValue(int[][] gift){
        if(gift.length == 0) return 0;
        int m = gift.length;
        int n = gift[0].length;

        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            dp[i][0] = gift[i][0];
        }
        for(int j = 0; j < n; j++){
            dp[0][j]= gift[0][j];
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + gift[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
