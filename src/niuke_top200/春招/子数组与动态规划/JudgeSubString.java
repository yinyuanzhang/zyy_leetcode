package niuke_top200.春招.子数组与动态规划;




// 值得一提的是：我很少判空
public class JudgeSubString {

    public static void main(String[] args) {

    }

    public boolean judgeSubString(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
           if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
