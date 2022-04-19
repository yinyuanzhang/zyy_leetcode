package niuke_top200.春招.动态规划;

import java.util.Arrays;

public class LongestUpSubSequence {

    public static void main(String[] args) {

    }


    public int longestUpSubSequence(int[] array){
        // dp定义问题，如果定义为范围内的，则一般式不好写不出来；因此这里的dp被定义为以..结尾的最长子序列

        int[] dp = new int[array.length];
        Arrays.fill(dp, 1);
        int maxLength = 0;
        for(int j = 0; j < array.length; j++){    // 这里我把它写成从1开始，写错啦。会导致maxLength默认值为0
            for(int i = 0; i < j; i++){
                if(array[j] > array[i]){
                    dp[j] = Math.max(dp[i] + 1, dp[j]);   // 这个一般式总是写错，记得要加1啊。
                }
            }
            maxLength = Math.max(maxLength, dp[j]);
        }

        return maxLength;

    }
}
