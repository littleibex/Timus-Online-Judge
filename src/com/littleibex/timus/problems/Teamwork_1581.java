package com.littleibex.timus.problems;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1581">1581. Teamwork</a>
 */
public class Teamwork_1581 {

    public static void main(String[] args) throws IOException {
        new Teamwork_1581().run();
    }

    public void run() throws IOException {
        int n = readInt();
        int x;
        int count = 1;

        int prev = readInt();
        n--;

        while (n > 0) {
            x = readInt();
            if (x != prev) {
                System.out.print(count);
                System.out.print(' ');
                System.out.print(prev);
                System.out.print(' ');
                count = 0;
            }
            count++;
            prev = x;
            n--;
        }
        System.out.print(count);
        System.out.print(' ');
        System.out.print(prev);
    }

    private int readInt() throws IOException {
        int i = 0;
        int c = System.in.read();
        while (isSpaceChar(c))
            c = System.in.read();
        do {
            i = i * 10 + c - '0';
            c = System.in.read();
        } while (!isSpaceChar(c));
        return i;
    }

    private boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }
}
