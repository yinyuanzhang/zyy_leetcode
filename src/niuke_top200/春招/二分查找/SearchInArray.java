package niuke_top200.春招.二分查找;

public class SearchInArray {

    public static void main(String[] args) {

    }


    public static boolean searchInArray(int[][] arr, int target){

        if(arr.length == 0 || arr[0].length == 0) return false;

        int row = 0;
        int col = arr[0].length - 1;
        while(row <= arr.length -1 && col >= 0){
            if(arr[row][col] == target) return true;
            else if(arr[row][col] < target) row++;
            else col--;
        }
        return false;
    }

}
