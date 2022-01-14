package com.company;

public class LastAndSecondLast {
    //Given a String return the last two characters of the String, reversed and seperated by a space

    public static String lastLetters(String word) {
        //iterate through string backwards two characters, concactonating each letter with a space. Trim output

        StringBuilder output = new StringBuilder();

        for (int count = word.length() - 1; count > word.length() - 3; count--) {
            output.append(word.charAt(count)).append(" ");
        }

        return output.toString().trim();
    }
}
