package niuke_top200.春招.子数组与动态规划;


import java.util.Arrays;

// 子序列意味着并不一定是连续的
// 若题目要求为 返回字典序最小的
public class LongestSubSequence {


    // 这题仅计算出来返回长度
    public static void main(String[] args) {

    }


    public static int LongestSubSequence(int[] arr){
        // dp定义 以第个i个数结尾的最长递增子序列
        int[] dp = new int[arr.length];

        // dp初始化
        Arrays.fill(dp, 1);

        // dp 遍历 先确定一个位置，再与前面的比较，这是两层循环的意义    maxLength也不用都要定义为最小值，这样极值情况，比如输入为空应为0
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++){
                if(arr[i] >= arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }
        return maxLength;
    }
}
