package niuke_top200.排序;

import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class QuickSort {

    public static void main(String[] args) {
        int[] test = new int[]{3,6,2,4};
        System.out.println(Arrays.toString(sort(test)));
    }

    public static int[] sort(int[] arr){
        if(arr.length == 0 || arr == null) return arr;
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int index = partition(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int posKey = arr[left];

        while(left < right) {
            while (left < right && arr[right] >= posKey) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= posKey) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = posKey;

        return left;
    }

}
