package niuke_top200.剑指offer.lee46_51;

public class numToString {

    public static void main(String[] args) {

    }


    public int numToString(int num){
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0] = 1;

        for (int i = 2; i < s.length(); i++) {
            String subString = s.substring(i - 1, i + 1);
            if(isValid(subString)){
                dp[i] = dp[i - 2]*2;
            }
        }
        return dp[s.length() - 1];
    }

    public boolean isValid(String s){
        if(Integer.valueOf(s) <= 25){
            return true;
        }
        return false;
    }
}


//整体状态转移方程想错了！！
//一起翻译和只翻译一个