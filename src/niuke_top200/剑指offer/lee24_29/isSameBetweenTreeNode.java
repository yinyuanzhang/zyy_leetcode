package niuke_top200.剑指offer.lee24_29;

public class isSameBetweenTreeNode {

    public static void main(String[] args) {

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

        public boolean isSameBetweenTreeNode(TreeNode root){
            if(root == null) return true;
            return isSame(root.left, root.right);
        }

        private boolean isSame(TreeNode t1, TreeNode t2) {
            if(t1 == null && t2 == null) return true;
            if(t1 == null || t2 == null || t1.val != t2.val) return false;
            return isSame(t1.left, t2.right) && isSame(t1.right, t2.left);
        }
    }
}


// 理清楚镜像的特点是什么？
