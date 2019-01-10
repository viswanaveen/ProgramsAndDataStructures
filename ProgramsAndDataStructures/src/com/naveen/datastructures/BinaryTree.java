package com.naveen.datastructures;
//Java implementation to check if given Binary tree
//is a BST or not
 
/* Class containing left and right child of current
 node and key value*/
 class Node1
{
    int data;
    Node1 left, right;
 
    public Node1(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class BinaryTree
{
    //Root of the Binary Tree
    Node1 root;
 
    /* can give min and max value according to your code or
    can write a function to find min and max value of tree. */
 
    /* returns true if given search tree is binary
     search tree (efficient version) */
    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
 
    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    boolean isBSTUtil(Node1 node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
 
    /* Driver program to test above functions */
    //The left sub-tree of a node has a key less than or equal to its parent node's key.

//The right sub-tree of a node has a key greater than to its parent node's key.
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node1(50);
        tree.root.left = new Node1(30);
        tree.root.right = new Node1(60);
        tree.root.right.left = new Node1(55);
        tree.root.left.left = new Node1(20);
        tree.root.left.right = new Node1(40);
        
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}