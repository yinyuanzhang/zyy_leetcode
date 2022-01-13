package niuke_top200.剑指offer.lee40_45;

public class maxSum {

    public static void main(String[] args) {

    }

    //错误示范
    public int maxSum(int[] arr){

        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;

        }
        return sum;
    }


    public int maxSumRight(int[] arr){
        int max = arr[0];
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(sum < 0) sum = 0;
            sum += arr[i];
            if(sum > max) max = sum;
        }
        return max;
    }

}
