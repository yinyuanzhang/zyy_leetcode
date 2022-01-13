package niuke_top200.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class coursesBFS {


    public boolean canFinishedCourses(int numCourses, int[][] prerequisites){
        int[] inDee = new int[numCourses];
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }

        for(int[] info : prerequisites){
            edges.get(info[1]).add(info[0]);
            inDee[info[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDee.length; i++) {
            if(inDee[i] == 0){
                queue.offer(i);
            }
        }

        int num = 0;
        while(queue.size() > 0){
            num++;
            int u = queue.poll();
            for(int v : edges.get(u)){
                inDee[v]--;
                if(inDee[v] == 0){
                    queue.offer(v);
                }
            }
        }
        return num == numCourses;
    }
}
