package com.company;

public class CountingClosedPaths {

    public static int closedPaths(int number) {
        /*
        Stringify number
        Iterate through each element of numberString
        Run a Switch case on each element and increment paths as required
        Return paths
         */
        int paths = 0;
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            switch(numberString.charAt(i)) {
                case '0':
                case '4':
                case '6':
                case '9':
                    paths++;
                    break;
                case '8':
                    paths += 2;
                    break;
                default:
                    break;
            }
        }




        return paths;
    }
}
