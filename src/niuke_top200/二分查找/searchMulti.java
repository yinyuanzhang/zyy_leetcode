package niuke_top200.二分查找;

public class searchMulti {


    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target){
                if(arr[left] < target && arr[left] > arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else {
                if(arr[left] > target && arr[left] < arr[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
