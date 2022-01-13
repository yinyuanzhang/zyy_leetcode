package niuke_top200.剑指offer.lee30_33;

public class searchTree {

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

    public boolean searchTree(int[] afterOrder){
       return isSearchTree(afterOrder, 0, afterOrder.length - 1);
    }

    private boolean isSearchTree(int[] afterOrder, int i, int j) {
        if(i >= j) return true;
        int middle = i;
        while(afterOrder[middle] < afterOrder[j]){
            middle++;
        }

        int after = middle;
        while(after < j){
            if(afterOrder[after] < afterOrder[j]){
                return false;
            }
            after++;
        }
        return isSearchTree(afterOrder, i, middle - 1)&&isSearchTree(afterOrder, middle, j - 1);
    }

}
