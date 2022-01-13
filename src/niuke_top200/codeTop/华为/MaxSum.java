package niuke_top200.codeTop.华为;

public class MaxSum {

    public static void main(String[] args) {

    }

    public int maxSum(int[] nums){
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(sum < 0) sum = nums[i];
            else sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
