package niuke_top200.春招.图;

import java.util.ArrayList;
import java.util.List;

// 1. 其实是在问是否有环，这是有向图其并不一定是多连通图，所以出现环只有一种可能，那就是单连通区域中出现回环。
// 2. 需求矩阵（数组） ——> 邻接表（链表），有整合作用
public class CanFinishCourse {

    public static void main(String[] args) {

    }

    public boolean canFinishCourse(int numCourses, int[][] prerequisites){
        // 1. 需求矩阵（数组） ——> 邻接表（链表）
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < prerequisites.length; i++) {
            lists.add(new ArrayList<>());
        }
        for(int[] singleReq: prerequisites){
            lists.get(singleReq[1]).add(singleReq[0]);
        }

        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(!dfs(lists, visited, i)) return false;
        }
        return true;
    }

    // 0代表未被访问，1代表当前节点访问，-1代表其他节点访问
    private boolean dfs(List<List<Integer>> lists, int[] visited, int i) {
        if(visited[i] == 1) return false;
        if(visited[i] == -1) return true;

        visited[i] = 1;
        for(Integer j : lists.get(i)){
            if(!dfs(lists, visited, j)) return false;
        }
        visited[i] = -1;
        return true;
    }
}

