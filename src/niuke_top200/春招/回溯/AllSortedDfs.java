package niuke_top200.春招.回溯;

import java.util.ArrayList;
import java.util.List;

public class AllSortedDfs {


    public static void main(String[] args) {

    }

    public static List<List<Integer>> lists = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> allSortedDfs(int[] array){
        boolean[] used = new boolean[array.length];
        dfs(array, used);
        return lists;
    }

    private static void dfs(int[] array, boolean[] used) {
        if(list.size() == array.length){
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if(used[i]) continue;

            list.add(array[i]);
            used[i] = true;
            dfs(array, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }

    }

}
