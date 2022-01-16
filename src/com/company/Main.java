package com.company;

import com.company.binarysearchtree.BSTreeNode;
import com.company.binarysearchtree.BinaryTreeSearch;
import com.company.car.Car;
import com.company.car.HondaCity;
import com.company.car.InnovaCrysta;
import com.company.car.WagonR;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(LastAndSecondLast.reverse("bat"));
//        FizzBuzz.fizzBuzz(15);
//        Car wagon = new WagonR("22");
//        Car honda = new HondaCity("17");
//        Car innova = new InnovaCrysta("25");
//
//        System.out.println(wagon);
//        System.out.println(honda);
//        System.out.println(innova);
//
//        List<String> products = new ArrayList<>();
//        List<Float> productPrices = new ArrayList<>();
//
//        products.add("eggs");
//        products.add("milk");
//        products.add("cheese");
//
//        productPrices.add(2.89f);
//        productPrices.add(2.99f);
//        productPrices.add(5.79f);
//
//        List<String> productsSold = new ArrayList<>();
//        List<Float> soldPrices = new ArrayList<>();
//
//        productsSold.add("eggs");
//        productsSold.add("eggs");
//        productsSold.add("milk");
//        productsSold.add("milk");
//        productsSold.add("cheese");
//
//        soldPrices.add(2.89f);
//        soldPrices.add(2.99f);
//        soldPrices.add(2.99f);
//        soldPrices.add(5.00f);
//        soldPrices.add(0.99f);
//
//        System.out.println(PriceCheck.priceCheck(products, productPrices, productsSold, soldPrices));

//        System.out.println(CountingClosedPaths.closedPaths(468901));

        /*
                    25
                    /\
                  12  30
                 / \    \
               10  15    50
         */

        BSTreeNode nodeOne = new BSTreeNode(25, null);
        BSTreeNode nodeTwo = new BSTreeNode(12, nodeOne);
        BSTreeNode nodeThree = new BSTreeNode(30, nodeOne);
        BSTreeNode nodeFour = new BSTreeNode(10, nodeTwo);
        BSTreeNode nodeFive = new BSTreeNode(15, nodeTwo);
        BSTreeNode nodeSix = new BSTreeNode(50, nodeThree);

        BSTreeNode.setNode(nodeOne, nodeTwo, nodeThree);
        BSTreeNode.setNode(nodeTwo, nodeFour, nodeFive);
        BSTreeNode.setNode(nodeThree, nodeSix, null);

        List<Integer> testArray = new ArrayList<>();

        testArray.add(20);
        testArray.add(30);
        testArray.add(14);
        testArray.add(12);

        System.out.println(BinaryTreeSearch.isPresent(nodeOne, testArray));

    }
}
