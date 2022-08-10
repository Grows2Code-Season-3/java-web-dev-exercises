package org.launchcode.studios.countingcharacters;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {

        String theString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] chars = theString.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char aChar : chars) {

             if (!counts.containsKey(aChar)) {
                 // This is the first time we're the character
                 counts.put(aChar, 1);
             } else {
                 // This is NOT the first time we're seeing it
                 Integer newCount = counts.get(aChar) + 1;
                 counts.put(aChar, newCount);
             }
        }

        for (Character aChar : counts.keySet()) {
            System.out.println(aChar + ": " + counts.get(aChar));
        }

    }

}
