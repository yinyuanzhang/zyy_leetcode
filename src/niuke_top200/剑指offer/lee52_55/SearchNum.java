package niuke_top200.剑指offer.lee52_55;

public class SearchNum {

    public static void main(String[] args) {

    }

    public int searchNum(int[] nums, int target){
        return searchNext(nums, target) - searchNext(nums, target - 1);
    }


    public int searchNext(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int middle = left + (right - left)/2;
            if(nums[middle] <= target) left = middle + 1;
            else right = middle - 1;
        }
        return left;
    }

}


// 二分查找 查最左边？ 查最右边？
// 这题转化为欲插入的位置。