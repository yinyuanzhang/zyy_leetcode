package niuke_top200.排列组合;

import java.util.ArrayList;
import java.util.List;

public class combineK {

    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k){
        backTransfor(n, k, 1);
        return result;
    }

    private void backTransfor(int n, int k, int startIndex) {

        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }

//      满足条件 list.size() + n - i + 1 >= k
        for(int i = startIndex; i <= list.size() + n - k + 1; i++){
            list.add(i);
            backTransfor(n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }


}
