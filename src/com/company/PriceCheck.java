package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PriceCheck {

    public static int priceCheck(List<String> products, List<Float> productPrices,
                                  List<String> productsSold, List<Float> soldPrices) {

        int numberOfErrors = 0;
        /*
        iterate through productsSold
        At each sold product, check the index of products to locate product and get the price from
            productPrices using that index
        Compare productPrices element to SoldPrices element
         */

        for (int i = 0; i < productsSold.size(); i++) {
            int productIndex = products.indexOf(productsSold.get(i));

            if (!Objects.equals(soldPrices.get(i), productPrices.get(productIndex))) {
                numberOfErrors++;
            }
        }



        return numberOfErrors;
    }
}
