package niuke_top200.春招.排序;

public class MergeTwoSortedArray {


    public void mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n -1;
        int len1 = m - 1;
        int len2 = n - 1;
        while(len1 >= 0 && len2 >= 0){
            if(nums1[len1] > nums2[len2]){
                nums1[index--] = nums1[len1--];
            }else{
                nums1[index--] = nums2[len2--];
            }
        }
        while(len2 >= 0){
            nums1[index--] = nums2[len2--];
        }
    }
}
