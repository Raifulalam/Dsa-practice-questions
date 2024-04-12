package practice.tree.search;

import practice.tree.TreeNode;

public class BinarySearchTree {
    public TreeNode rootnode;

    public BinarySearchTree() {
        this.rootnode = null;
    }

    public BinarySearchTree(TreeNode rootnode) {
        this.rootnode = rootnode;
    }

    public void insertNode(int data) {
        TreeNode node = new TreeNode(data);
        if (rootnode == null) {
            this.rootnode = node;
        } else {
            TreeNode currentNode = rootnode;
            TreeNode parentNode;
            while (true) {
                parentNode = currentNode;
                if (currentNode.data > data) {
                    currentNode = currentNode.leftNode;
                    if (currentNode == null) {
                        parentNode.leftNode = node;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode = node;
                        return;
                    }
                }
            }
        }
    }
    public BinarySearchTree getLeftSubTree(){
        if (rootnode != null && rootnode.leftNode!=null) {
            return new BinarySearchTree(rootnode.leftNode);

        }else return null;

    }
    public BinarySearchTree getRightSubTree(){
        if (rootnode != null && rootnode.rightNode!=null) {
            return new BinarySearchTree(rootnode.rightNode);
        }
        else return null;
    }
    public boolean isLeafNode(TreeNode node){
        if (node == null) {
            return true;
        }
        return node.leftNode==null && node.rightNode==null;
    }
    public TreeNode search(int key){
        TreeNode currentNode=rootnode;
        if (currentNode == null) {
            return new TreeNode(Integer.MIN_VALUE);
        }else{
            while (currentNode.data!=key){
                if (currentNode.data<key) {
                        currentNode=currentNode.rightNode;
                }else currentNode=currentNode.leftNode;
                if (currentNode == null) {
                    return new TreeNode(Integer.MIN_VALUE);
                }
            }
        }
        return currentNode;
    }

    public static void main(String[] args) {
        BinarySearchTree binaryTree=new BinarySearchTree();
        binaryTree.insertNode(25);
        binaryTree.insertNode(2);
        binaryTree.insertNode(5);
        System.out.println("binaryTree.isLeafNode(new TreeNode(50)) = " + binaryTree.isLeafNode(new TreeNode(25)));
        binaryTree.insertNode(20);
        binaryTree.insertNode(6);
        binaryTree.insertNode(5);
        binaryTree.insertNode(4);
        binaryTree.insertNode(50);
        binaryTree.insertNode(5);
        binaryTree.insertNode(15);
        binaryTree.insertNode(5);
        binaryTree.insertNode(2);


    }
}
