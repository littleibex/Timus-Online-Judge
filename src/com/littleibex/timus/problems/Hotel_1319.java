package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1319">1319. Hotel</a>
 */
public class Hotel_1319 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int N = io.nextInt();
        int start = N * (N - 1) / 2 + 1;

        for (int i = 0; i < N; i++) {
            io.writer.print(start);
            io.writer.print(' ');
            int r = start;
            for (int j = 1; j < N; j++) {
                r -= (i < j) ? N + i - j : N + j - i - 1;
                io.writer.print(r);
                io.writer.print(' ');
            }
            start += N - i;
            io.writer.println();
        }

        io.shutdown();
    }
}
