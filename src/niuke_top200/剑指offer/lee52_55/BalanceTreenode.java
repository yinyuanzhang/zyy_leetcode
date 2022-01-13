package niuke_top200.剑指offer.lee52_55;

public class BalanceTreenode {

    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }


    public boolean isBalanceTreenode(TreeNode root){
        if(root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanceTreenode(root.left)
                && isBalanceTreenode(root.right);

    }

    public int depth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

}

// 每个节点判断一次 logn, 共n个节点。
