package niuke_top200.剑指offer.lee52_55;

public class searchNumLoss {

    public static void main(String[] args) {

    }

    public int searchNumLoss(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int middle = left + (right - left)/2;
            if(nums[middle] == middle){
                left = middle + 1;
            }else{
                right = middle;
            }
        }
        return nums[right] == right ? right + 1 : right;
    }
}


// 二分查找：
// 到底要不要写成 left<=right   如果right = middle； 会出现left一直等于right; 死循环了。
// 使用 left<right 的情形需注意边界条件 ——> 一个数值或没有数值  left = right = 0;

