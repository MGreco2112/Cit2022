package com.company.binarysearchtree;

public class BSTreeNode {
    private final Integer value;
    //lesser value
    private BSTreeNode left;
    //greater value
    private BSTreeNode right;
    //either parent node value or null
    private final BSTreeNode parent;

    public BSTreeNode(Integer value, BSTreeNode parent) {
        this.value = value;

        this.parent = parent;
    }

    public Integer getValue() {
        return value;
    }

    public BSTreeNode getLeft() {
        return left;
    }

    public BSTreeNode getRight() {
        return right;
    }

    public BSTreeNode getParent() {
        return parent;
    }

    public static void setNode(BSTreeNode parent, BSTreeNode nodeOne, BSTreeNode nodeTwo) {
        if (nodeOne.value < parent.value) {
            parent.left = nodeOne;
            parent.right = nodeTwo;
        } else {
            parent.left = nodeTwo;
            parent.right = nodeOne;
        }

    }
}
