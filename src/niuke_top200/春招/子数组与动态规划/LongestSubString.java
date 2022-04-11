package niuke_top200.春招.子数组与动态规划;


// 这种思路没想明白
// dp[i][j] 该区间内的最长回文子串长度
// dp[i][j] = dp[i + 1][j - 1] + arr[i] == arr[j] ? 2 : 0;
// 1.根据回文特性，从两边到中间使用二维dp;  2.根据字符区间判断dp特性。

// 第一种思路：直接就是二层遍历，再判断是否是 o(n3)复杂度。   第二种思路：动态规划的解法o(n2)，但空间复杂度也是o(n2)
// 第三种思路：中心扩散法：遍历到下标，然后再向两边求长度。 时间o(n2) 空间o(n)
public class LongestSubString {

    public static void main(String[] args) {

    }

    public static int longestSubString(String A, int n){
        // dp定义为是否是回文子串  新定义的默认为false
        boolean[][] dp = new boolean[A.length()][A.length()];

        // dp的初始化          写成这样也可以 dp[A.length()-1][A.length()-1] = true;
        for (int i = 0; i < A.length(); i++) {
            dp[i][i] = true;
        }

        int maxLength = 0;
        // 遍历顺序要根据dp的一般式来[这个很有意思哈]  dp[i][j] = dp[i + 1][j - 1]
        for(int row = A.length() - 1; row >= 0; row--){
            for(int col = row; col < A.length(); col++){
                if(A.charAt(row) == A.charAt(col)){
                    if(col - row <= 1) dp[row][col] = true;
                    else dp[row][col] = dp[row + 1][col - 1];
                    if(dp[row][col]) maxLength = Math.max(maxLength, col - row + 1);
                    // 若是求具体的字符，就记录下startIndex return A.substring(startIndex,maxLength)
                }
            }
        }
        return maxLength;
    }
}
