package niuke_top200.春招.动态规划;


// 最长连续递增子序列 dp空间复杂度较高，用贪心（直接求）更改start索引位置即可。
public class LongestUpSubArray {

    public static void main(String[] args) {

    }


    public int longestUpSubArray(int[] array){
        if(array.length == 0) return 0;
        // dp[i] 以i为结尾的最长连续递增子串长度     dp[i] = dp[i] >= dp[i - 1] ? dp[i - 1] + 1 : 1;
        int[] dp = new int[array.length];
        dp[0] = 1;
        int maxLength = 1;
        for(int i = 1; i < array.length; i++){
            dp[i] = array[i] >= array[i - 1] ? dp[i - 1] + 1 : 1;
            // 写成这样该打 要搞懂dp的意思啊    dp[i] = dp[i] >= dp[i - 1] ? dp[i - 1] + 1 : 1;
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}
