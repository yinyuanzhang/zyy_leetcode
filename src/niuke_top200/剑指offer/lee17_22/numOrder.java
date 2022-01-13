package niuke_top200.剑指offer.lee17_22;

public class numOrder {

    public static void main(String[] args) {

    }

    // 基本思路（可以忽略了）
    public int[] numOrder(int[] nums){
        int[] result = new int[nums.length];
        int tag = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 1){
                result[tag++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 == 0){
                result[tag++] = nums[i];
            }
        }
        return result;
    }

    // 双指针(这个必记)
    public int[] numOrder2(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int temp;
        while(left < right){
            while(left < right && nums[left]%2 == 1){
                left++;
            }
            while(left < right && nums[right]%2 == 0){
                right--;
            }
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
