package niuke_top200.春招.二分查找;

public class MiniNumInArray {

    public static void main(String[] args) {

    }

    public int miniNumInArray(int[] arr){

        if(arr.length == 0) return -1;
        int tag = arr[arr.length - 1];
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int middle = left + (right - left)/2;
            if(arr[middle] > tag){
                left = middle + 1;
            }else if(arr[left] < tag){
                right = middle;
            }else{
                right--;
            }
        }
        return arr[left];
    }

}
