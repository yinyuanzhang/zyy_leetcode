package niuke_top200.春招.二分查找;

public class SearchInTwoPartArray {

    public static void main(String[] args) {

    }


    public static int searchInTwoPartArray(int[] arr, int target){
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int middle = left + (right - left)/2;
            if (arr[middle] == target) {
                return middle;
            }

            if(arr[middle] >= arr[left]){
                if(target >= arr[left] && target < arr[middle]){
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }
            }else{
                if(target > arr[middle] && target <= arr[right]){
                    left = middle + 1;
                }else{
                    right = middle;
                }

            }
        }
        return -1;

    }
}