package com.company.binarysearchtree;

import java.util.*;

public class BinaryTreeSearch {

    public static List<Integer> isPresent(BSTreeNode root, List<Integer> val) {
        List<Integer> binaryResults = new ArrayList<>();

        List<BSTreeNode> mappedTree = mapTree(root).stream().toList();

        boolean wasFound = false;

        for (Integer value : val) {
            wasFound = false;
            for (BSTreeNode bsTreeNode : mappedTree) {
                if (Objects.equals(value, bsTreeNode.getValue())) {
                    binaryResults.add(1);
                    wasFound = true;
                }

            }
            if (!wasFound) {
                binaryResults.add(0);
            }
        }

        return binaryResults;
    }

    private static Set<BSTreeNode> mapTree(BSTreeNode root) {
        Set<BSTreeNode> mappedTree = new HashSet<>();
        BSTreeNode currentNode = root;

        boolean loopCondition = true;


        while (loopCondition) {
            mappedTree.add(currentNode);


            if (currentNode.getLeft() != null && !mappedTree.contains(currentNode.getLeft())) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getRight() != null && !mappedTree.contains(currentNode.getRight())) {
                currentNode = currentNode.getRight();
            } else if (currentNode.getParent() != null) {
                currentNode = currentNode.getParent();
            } else {
                loopCondition = false;
            }
        }

        return mappedTree;
    }
}
