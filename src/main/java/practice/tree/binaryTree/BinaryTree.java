package practice.tree.binaryTree;
import practice.tree.TreeNode;
public class BinaryTree {
  public TreeNode rootnode;

    public BinaryTree() {
        this.rootnode = null;
    }

    public BinaryTree(TreeNode rootnode) {
        this.rootnode = rootnode;
    }
    public void insertNode(int data){
        TreeNode node=new TreeNode(data);
        if (rootnode == null) {
            this.rootnode=node;
        }else {
            TreeNode currentNode=rootnode;
            TreeNode parentNode ;
            while (true){
                parentNode=currentNode;
                if(currentNode.data>data){
                    currentNode=currentNode.leftNode;
                    if (currentNode == null) {
                        parentNode.leftNode=node;
                        return;
                    }
                } else {
                    currentNode=currentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode=node;
                        return;
                    }
                }
            }
        }
    }

}
