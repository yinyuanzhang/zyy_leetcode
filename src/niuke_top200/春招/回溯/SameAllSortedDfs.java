package niuke_top200.春招.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameAllSortedDfs {


    public static void main(String[] args) {

    }

    public static List<List<Integer>> lists = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> sameAllSortedDfs(int[] array){
        boolean[] used = new boolean[array.length];
        Arrays.sort(array);
        dfs(array, used);
        return lists;
    }

    private static void dfs(int[] array, boolean[] used) {
        if(list.size() == array.length){
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if(used[i] || i > 0 && array[i] == array[i - 1] && !used[i - 1]) continue;

            list.add(array[i]);
            used[i] = true;
            dfs(array, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }

    }

}
