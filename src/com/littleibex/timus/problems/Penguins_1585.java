package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1585">1585. Penguins</a>
 */
public class Penguins_1585 {

    public static void main(String[] args) throws IOException {
        new Penguins_1585().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int[] penguins = new int[3];
        int n = Integer.parseInt(io.readLine());
        while (n > 0) {
            penguins[getPenguinID(io.readLine().charAt(0))]++;
            n--;
        }

        if (penguins[0] > penguins[1] && penguins[0] > penguins[2]) io.writer.print("Emperor Penguin");
        else if (penguins[1] > penguins[2]) io.writer.print("Little Penguin");
        else io.writer.print("Macaroni Penguin");

        io.shutdown();
    }

    private int getPenguinID(char firstChar) {
        switch (firstChar) {
            case 'E':
                return 0;
            case 'L':
                return 1;
            case 'M':
                return 2;
            default:
                return -1;
        }
    }
}
