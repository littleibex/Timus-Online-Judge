package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1313">1313. Some Words about Sport</a>
 */
public class Some_Words_about_Sport_1313 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = reader.readInt();
        int[][] a = new int[N][N];

        int i, j, k;

        for (i = 0; i < N; ++i) {
            for (j = 0; j < N; ++j) {
                a[i][j] = reader.readInt();
            }
        }

        for (i = 0; i < 2 * N - 1; ++i) {
            for (j = 0; j <= i && j < N; ++j) {
                k = i - j;
                if (k >= 0 && k < N) {
                    writer.print(a[k][j]);
                    writer.print(" ");
                }
            }
        }

        writer.flush();
        writer.close();
    }
}
