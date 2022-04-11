package niuke_top200.春招.二分查找;

public class Search {

    public static void main(String[] args) {

    }

    public static int Search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = left + (right - left)/2;
            if(target > nums[middle]){
                left = middle + 1;
            }else if(target < nums[middle]){
                right = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }




}
