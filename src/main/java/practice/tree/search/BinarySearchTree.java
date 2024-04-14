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
    public void traverseTreeInOrder(TreeNode rootNode) {
        if (rootNode != null) {
            traverseTreeInOrder(rootNode.leftNode);
            System.out.println(rootNode.data);
            traverseTreeInOrder(rootNode.rightNode);
        }
    }
    public TreeNode findMinimumNode(TreeNode root){
        if (root == null) {
            return null;
        } else if (isLeafNode(root)) {
            return root;
        }else{
             TreeNode currentNode=rootnode;
             TreeNode parentNode=null;
             while(currentNode!=null){
                 parentNode=currentNode;
                 currentNode=currentNode.leftNode;
             }
            return parentNode;
        }
    }
    public TreeNode findMaximumNode(TreeNode root){
        if (root == null) {
            return  null;
        } else if (isLeafNode(root)) {
            return  root;
        }else{
            TreeNode currentNode=rootnode;
            TreeNode parentNode=null;
            while(currentNode!=null){
                parentNode=currentNode;
                currentNode=currentNode.rightNode;
            }
            return parentNode;
        }
    }
    private TreeNode getSuccessorNode(TreeNode nodeToBeDeleted) {
        TreeNode successorNodeParent = nodeToBeDeleted;
        TreeNode successorNode = nodeToBeDeleted;

        TreeNode currentNode = nodeToBeDeleted.rightNode;

        while (currentNode != null) {
            successorNodeParent = successorNode;
            successorNode = currentNode;
            currentNode = currentNode.leftNode;
        }

        if (successorNode != nodeToBeDeleted.rightNode) {
            successorNodeParent.leftNode = successorNode.rightNode;
            successorNode.rightNode = nodeToBeDeleted.rightNode;
        }
        return successorNode;
    }
    public boolean deleteNode(int key){
        TreeNode currentNode=rootnode;
        TreeNode parentNode=null;
        // Find the node to be deleted
        while (currentNode!=null && currentNode.data!=key){
            if (currentNode.data>key) {
                currentNode = currentNode.leftNode;
            }else {
                currentNode = currentNode.rightNode;
            }
        }
        //if node not found then return false
        if (currentNode == null) {
            return false;
        }
        // handle the node on type
        if (isLeafNode(currentNode)) {
            if (currentNode == null) {
                rootnode=null;
            } else if (parentNode.leftNode== currentNode) {
                    parentNode.leftNode=null;
            }else {
                parentNode.rightNode=null;
            }
        } else if (currentNode.leftNode == null) {
            // If only right child, replace the current node with the right child
            if (parentNode == null) {
                this.rootnode = currentNode.rightNode;
            } else if (parentNode.leftNode == currentNode) {
                parentNode.leftNode = currentNode.rightNode;
            } else {
                parentNode.rightNode = currentNode.rightNode;
            }
        } else if (currentNode.rightNode == null) {
            // If only left child, replace the current node with the left child
            if (parentNode == null) {
                this.rootnode = currentNode.leftNode;
            } else if (parentNode.leftNode == currentNode) {
                parentNode.leftNode = currentNode.leftNode;
            } else {
                parentNode.rightNode = currentNode.leftNode;
            }
        } else {
            // If two children, find the in-order successor and replace the current node
            TreeNode successorNode = getSuccessorNode(currentNode);
            int successorKey = successorNode.data;
            deleteNode(successorKey); // Recursively delete the successor node
            currentNode.data = successorKey;
        }
        return true;
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
        System.out.println("binaryTree.search(15) = " + binaryTree.search(15));
        System.out.println("binaryTree.search(51) = " + binaryTree.search(25));


    }
}
