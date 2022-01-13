package niuke_top200.codeTop.华为;

import java.util.ArrayList;
import java.util.List;

public class GenerateParthen {

    public static void main(String[] args) {

    }

    List<String> res = new ArrayList<>();
    public List<String> generateParthen(int n){
        StringBuilder path = new StringBuilder();
        backDfs(path, 0, 0, n);
        return res;
    }

    private void backDfs(StringBuilder path, int left, int right, int n) {
        if(left == n && right == n){
            res.add(path.toString());
            return;
        }

        if(left < right) return;

        if(left < n){
            path.append("(");
            backDfs(path, left + 1, right, n);
            path.deleteCharAt(path.length() - 1);
        }

        if(right < n){
            path.append(")");
            backDfs(path, left, right + 1, n);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
