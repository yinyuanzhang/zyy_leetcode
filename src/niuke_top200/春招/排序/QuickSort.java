package niuke_top200.春招.排序;


// 快排的思路弄懂后，代码是不难写的。
// 左右两边排好后 + 递归调用即可(终止条件)   if要包裹完全
public class QuickSort {

    public static void main(String[] args) {

    }

    public int[] quickSort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        sort(arr, left, right);
        return arr;
    }


    private void sort(int[] arr, int left, int right) {
        int start = left;
        int end = right;
        if(left < right){
            int posTag = arr[left];
            while(left < right){
                while(left < right && arr[right] >= posTag){
                    right--;
                }
                arr[left] = arr[right];
                while(left < right && arr[left] <= posTag){
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = posTag;
            sort(arr, start, left);
            sort(arr, left + 1, end);
        }
    }
}
