package niuke_top200.春招.二分查找;



// 这道题我觉得理解题目意思最重要    2个条件：1.nums[-1] = nums[n] = -∞ 必有峰值   2.值均不相等，这是做二分查找区间判断使用的。
public class SearchPeak {

    public static void main(String[] args) {

    }


    public static int searchPeak(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int middle = left + (right - left)/2;
            if(arr[middle] < arr[middle + 1]) left = middle + 1;
            else right = middle;
        }
        return left;
    }
}
