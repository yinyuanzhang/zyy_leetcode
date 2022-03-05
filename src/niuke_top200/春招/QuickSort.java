package niuke_top200.春招;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] test = new int[]{3,1,4};
        System.out.println(Arrays.toString(sort(test)));
    }

    private static int[] sort(int[] arr) {
        if(arr.length == 1 || arr == null) return arr;
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left < right){
            int index = paration(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }


    // 算法的核心
    private static int paration(int[] arr, int left, int right) {
        int posKey = arr[left];

        while(left < right){
            while(left < right && arr[right] >= posKey){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= posKey){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = posKey;
        return left;
    }


}

//  保证posKey左边均小于它，右边均大于它
//  arr[left]=posKey   既然指针停在left，说明left原本的值已经被替换，现在的值无意义。