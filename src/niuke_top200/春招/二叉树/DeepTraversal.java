package niuke_top200.春招.二叉树;

import java.util.ArrayList;
import java.util.List;

public class DeepTraversal {


    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }

    }


    public static void main(String[] args) {


    }

    // 前、中、后序的递归写法仅仅是dfs遍历顺序的区别，其他一致。
    public static int[] preTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preDfs(list, root);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static void preDfs(List<Integer> list, TreeNode root) {
        if(root != null){
            list.add(root.val);
            preDfs(list, root.left);
            preDfs(list, root.right);
        }
    }

}
