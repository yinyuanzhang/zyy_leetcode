package niuke_top200.春招.子数组与动态规划;


// 这种不连续的数组中的序列貌似除了动规也没有其他好的方法了     leetcode143题
public class LongestCommonSequence {


    // 这题仅计算出来返回长度
    public static void main(String[] args) {

    }

    // 用了n+1维的数组，一定要注意该维数组所代表的的含义。
    public static int  longestCommonSequence(String s1, String s2){
        // dp定义 dp[i][j]代表str1中[0:i-1]的和str2中[0:j-1]的最大长度
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }



    // 以下是错误示范典型
//    public static int  longestCommonSequence(String s1, String s2){
//        // dp定义 dp[i][j]代表str1中以i结尾的和str2中以j结尾的子序列的最大长度
//        int[][] dp = new int[s1.length()][s2.length()];
//
//        if(s1.length() == 0 || s2.length() == 0) return 0;
//        for (int j = 0; j < s2.length(); j++) {
//            if(s1.charAt(0) == s2.charAt(j)) dp[0][j] = 1;
//        }
//
//        int maxLength = 0;
//        // 外围循环是i，所以i的前一行就是需要初始定义的。
//        for (int i = 1; i < s1.length(); i++) {
//            for(int j = 1; j < s2.length(); j++){
//                if(s1.charAt(i) != s2.charAt(j)) dp[i][j] = 0;
//                else {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    maxLength = Math.max(maxLength, dp[i][j]);
//                }
//            }
//        }
//        return maxLength;
//    }
}
