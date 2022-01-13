package niuke_top200.剑指offer.lee52_55;

public class BalanceTreeNodeBest {

    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }


    public boolean isBalanceTreeNodeBest(TreeNode root){
        return depth(root) != -1;
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = depth(root.left);
        if(leftDepth == -1) return -1;
        int rightDepth = depth(root.right);
        if(rightDepth == -1) return -1;
        return Math.abs(leftDepth - rightDepth) <= 1 ?  Math.max(leftDepth, rightDepth) + 1 : -1;
    }
}
