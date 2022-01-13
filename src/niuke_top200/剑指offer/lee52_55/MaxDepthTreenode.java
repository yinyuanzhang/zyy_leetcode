package niuke_top200.剑指offer.lee52_55;

public class MaxDepthTreenode {

    public static void main(String[] args) {

    }

    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public int maxDepthTreenode(TreeNode root){
        if(root == null) return 0;

        int leftDepth = maxDepthTreenode(root.left);
        int rightDepth = maxDepthTreenode(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
