package org.launchcode.java.lessons.ch8;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {

    // use case is Collections.sort(listOfSquares, squareComparator);

    @Override
    public int compare(Square o1, Square o2) {

        double difference = o1.getSideLength() - o2.getSideLength();

        if (difference > 0) {
            return 1;
        }

        if (difference < 0) {
            return -1;
        }

        return 0;
    }

}
