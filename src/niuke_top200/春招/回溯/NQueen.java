package niuke_top200.春招.回溯;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// n皇后问题
// 横向遍历，纵向dfs调用
// 这种写法的缺点就是  建立了二维数组，空间复杂度高
public class NQueen {

    public static void main(String[] args) {

    }

    char[][] array;
    List<List<String>> result;
    public List<List<String>> nQueen(int n){
        // 学习下字符数组的初始化
        array = new char[n][n];
        for(char[] rowArray : array){
            Arrays.fill(rowArray, '.');
        }

        result = new ArrayList<>();
        dfs(0, 0, n);
        return result;
    }

    public void dfs(int row, int col, int n){
        if(row == n){
            result.add(new ArrayList<>(Array2List(array)));   //这里array本身就是新建的，所以写成result.add(Array2List(array))
        }

        for(int j = col; j < n; j++){
            if(isValid(col, j, n)){
                array[row][j] = 'Q';
                dfs(row + 1, j, n);
                array[row][j] = '.';
            }
        }
    }

    private List<String> Array2List(char[][] array) {
        List<String> list = new ArrayList<>();
        for(char[] rowArray : array){
            list.add(String.copyValueOf(rowArray));
        }
        return list;
    }

    private boolean isValid(int row, int col, int n) {
        // row,col 前面有dfs判断，本身就在合理范围内
        for (int i = 0; i < row; i++) {
            if(array[i][col] == 'Q') return false;
        }
        // 左上角
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(array[i][j] == 'Q') return false;
        }
        // 右上角
        for(int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++){
            if(array[i][j] == 'Q') return false;
        }
        return true;
    }

}

