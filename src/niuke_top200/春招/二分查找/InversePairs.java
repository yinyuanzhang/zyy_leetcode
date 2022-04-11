package niuke_top200.春招.二分查找;

public class InversePairs {

    public static void main(String[] args) {

    }

    int count = 0;
    public int inversePairs(int[] arr){
//        this.count = 0;
        mergePairs(arr, 0, arr.length - 1);
        return count;
    }


    // 主要体现在归，即分解过程
    private void mergePairs(int[] arr, int left, int right) {
        if(left >= right) return;

        int middle = left + (right - left)/2;
        mergePairs(arr, left, middle);
        mergePairs(arr, middle + 1, right);
        mergeCount(arr, left, middle, right);
    }


    // 主要体现在并，即边合并边排序。
    private void mergeCount(int[] arr, int left, int middle, int right) {

        int i = left;
        int j = middle + 1;
        int t = 0;
        int[] temp = new int[right - left + 1];

        while(i <= middle && j <= right){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
                count += middle - i + 1;
            }
        }

        while(i <= middle){
            temp[t++] = arr[i++];
        }
        while(j <= right){
            temp[t++] = arr[j++];
        }

        for (int k = left; k <= right; k++) {
            arr[k] = temp[k - left];
        }

    }
}
