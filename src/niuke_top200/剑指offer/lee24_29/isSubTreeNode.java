package niuke_top200.剑指offer.lee24_29;

public class isSubTreeNode {

    public static void main(String[] args) {

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public boolean isSubTreeNode(TreeNode A, TreeNode B){
        if(A == null || B == null) return false;
        return isSubFromRoot(A, B) || isSubTreeNode(A.left, B) || isSubTreeNode(A.right, B);
    }


    public boolean isSubFromRoot(TreeNode A, TreeNode B){
        if (B == null) return true;
        if (A == null || B.val != A.val) return false;
        else{
            return isSubFromRoot(A.left, B.left) && isSubFromRoot(A.right, B.right);
        }
    }
}
