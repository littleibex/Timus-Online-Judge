package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1893">1893. A380</a>
 */
public class A380_1893 {

    private static final String SEAT_AISLE = "aisle";
    private static final String SEAT_WINDOW = "window";
    private static final String SEAT_NORMAL = "neither";

    public static void main(String[] args) throws IOException {
        new A380_1893().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int seatRow = 0;
        int c = io.read();

        do {
            seatRow = seatRow * 10 + c - '0';
            c = io.read();
        } while (c < 'A' || c > 'Z');

        int seatCol = c;

        io.writer.print(this.getSeatDescription(seatRow, seatCol));

        io.shutdown();
    }

    private String getSeatDescription(int seatRow, int seatCol) {
        if (seatRow > 20) {
            switch (seatCol) {
                case 'A':
                case 'K':
                    return SEAT_WINDOW;

                case 'C':
                case 'D':
                case 'G':
                case 'H':
                    return SEAT_AISLE;
            }
        } else if (seatRow > 2) {
            switch (seatCol) {
                case 'A':
                case 'F':
                    return SEAT_WINDOW;

                case 'B':
                case 'C':
                case 'D':
                case 'E':
                    return SEAT_AISLE;
            }
        } else {
            switch (seatCol) {
                case 'A':
                case 'D':
                    return SEAT_WINDOW;

                case 'B':
                case 'C':
                    return SEAT_AISLE;
            }
        }

        return SEAT_NORMAL;
    }
}
