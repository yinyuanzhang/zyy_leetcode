package niuke_top200.春招.动态规划;

public class LongestPalindromeSubArray {


    public static void main(String[] args) {

    }

    // 法一: 动规解决
    public String longestPalindromeSubArrayByDp(String s){
        // dp[i][j]代表以i为起点、j为终点是否为回文子串    dp[i][j] = dp[i + 1][j - 1] 这种一般式的写法本来就是错误的(不全)。
        // 这道题遍历顺序可知矩阵只有一部分用到了。  j - i <= 2 自动完成了初始化
        int length = s.length();
        if(length == 0) return "";
        boolean[][] dp = new boolean[length][length];

        int maxLength = 1;
        int begin = 0;
        for(int i = length - 1; i >= 0; i--){
            for(int j = i; j < length; j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i <= 2){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j] && j - i + 1 > maxLength){
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLength);
    }


    // 动态规划时间o(n2) 空间o(n2),  而中心扩散时间o(n2) 空间o(1)
    public String longestPalindromeSubArrayByCenterExpand(String s){
        int length = s.length();
        if(length == 0) return "";

        int start = 0, end = 0;

        for(int i = 0; i < length; i++){
            int len1 = centerExpand(s, i, i);
            int len2 = centerExpand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start + 1){
                start = i - (len - 1)/2;   //说实话这里我有点不知道怎么处理，只能理解为1个和3个数字举特例。
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int centerExpand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;   //这里是长度 right - left + 1 - 2
    }
}
