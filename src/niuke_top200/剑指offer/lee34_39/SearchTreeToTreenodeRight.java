package niuke_top200.剑指offer.lee34_39;

public class SearchTreeToTreenodeRight {

    public static void main(String[] args) {

    }

    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    Node pre,head;
    public Node searchTreeToTreenodeRight(Node root){
        if(root == null) return root;
        transTreeNode(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void transTreeNode(Node curr) {
        if(curr == null) return;
        transTreeNode(curr.left);
        if(pre != null) pre.right = curr;
        else head = curr;
        curr.left = pre;
        pre = curr;
        transTreeNode(curr.right);
    }
}
