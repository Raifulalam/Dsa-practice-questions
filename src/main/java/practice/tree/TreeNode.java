package practice.tree;

public class TreeNode {
    public int data;
    public TreeNode leftNode;
    public TreeNode rightNode;
    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
