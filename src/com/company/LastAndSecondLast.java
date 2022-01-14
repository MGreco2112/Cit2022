package com.company;

public class LastAndSecondLast {
    //Given a String return the last two characters of the String, reversed and seperated by a space

    public static String reverse(String input) {
        //iterate through string backwards two characters, concactonating each letter with a space. Trim output

        StringBuilder output = new StringBuilder();

        for (int count = input.length() - 1; count > input.length() - 3; count--) {
            output.append(input.charAt(count)).append(" ");
        }

        return output.toString().trim();
    }
}
