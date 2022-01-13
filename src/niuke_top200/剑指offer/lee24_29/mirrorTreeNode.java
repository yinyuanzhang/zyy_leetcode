package niuke_top200.剑指offer.lee24_29;

public class mirrorTreeNode {

    public static void main(String[] args) {

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

        public TreeNode mirrorTreeNode(TreeNode root){
            if (root == null) return root;
            TreeNode temp = root.left;
            root.left = mirrorTreeNode(root.right);
            root.right = mirrorTreeNode(temp);
            return root;
        }
    }
}
