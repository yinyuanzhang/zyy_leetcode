package niuke_top200.春招.图;

public class IsTwoPart {

    public static void main(String[] args) {

    }

    // 这里visited[i] == 0 && 的条件必须加，因为上色是这里给定的
    public boolean isTwoPart(int[][] graph){

        int[] visited = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(visited[i] == 0 && !dfs(graph, visited, i, 1)){
                return false;
            }
        }
        return true;
    }

    // dfs 此次深度遍历是否为二分
    private boolean dfs(int[][] graph, int[] visited, int i, int colour) {
        // 写递归永远注意要有终止条件
        if(visited[i] != 0) return colour == visited[i];

        // 发起递归调用，注意这里有返回值
        visited[i] = colour;
        for(int node : graph[i]){
            if(!dfs(graph, visited, node, -colour)) return false;
        }
        return true;
    }
}

