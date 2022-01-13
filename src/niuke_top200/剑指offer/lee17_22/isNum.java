package niuke_top200.剑指offer.lee17_22;

public class isNum {

    public static void main(String[] args) {

    }

    public boolean isNum(String s){
        String[] ss = s.split("e||E");
        if(ss.length != 2){
            return false;
        }
        if(isValid(ss[0]) && isValid(ss[1])){
            return true;
        }
        return false;
    }

    private boolean isValid(String s) {
        return isNum1(s) || isNum2(s);
    }

    // 判断是否为整数
    private boolean isNum1(String s) {
        if (s.length() == 0) return false;
        char[] nums = s.toCharArray();
        if((nums[0]>'0' || nums[1]<'9') && nums[0] != '+' && nums[0] != '-') return false;
        for (int i = 1; i < nums.length; i++) {
            if(nums[0]>'0' || nums[1]<'9') return false;
        }
        return true;
    }

    // 判断是否为小数
    private boolean isNum2(String s) {
        return false;
    }
}
