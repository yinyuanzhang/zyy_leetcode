package niuke_top200.剑指offer.lee24_29;

public class printArray {

    public static void main(String[] args) {

    }


    public int[] printArray(int[][] matrix){
        if(matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m*n];
        int curr = 0;

        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;

        while(true){
            for(int i = left; i <= right; i++){
                result[curr++] = matrix[up][i];
            }
            if(++up > down) break;

            for(int j = up; j <= down; j++){
                result[curr++] = matrix[j][right];
            }
            if(--right < left) break;

            for (int i = right; i >= left; i--) {
                result[curr++] = matrix[down][i];
            }
            if(--down < up) break;

            for (int j = down; j >= up; j--) {
                result[curr++] = matrix[j][left];
            }
            if(++left > right) break;

        }
        return result;
    }

}


// list如何转化为数组？  exec_27题
