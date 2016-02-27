package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1319">1319. Hotel</a>
 */
public class Hotel_1319 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = reader.readInt();
        int start = N * (N - 1) / 2 + 1;

        for (int i = 0; i < N; i++) {
            writer.print(start);
            writer.print(' ');
            int r = start;
            for (int j = 1; j < N; j++) {
                r -= (i < j) ? N + i - j : N + j - i - 1;
                writer.print(r);
                writer.print(' ');
            }
            start += N - i;
            writer.println();
        }

        writer.flush();
        writer.close();
    }
}
