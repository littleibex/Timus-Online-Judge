package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1313">1313. Some Words about Sport</a>
 */
public class Some_Words_about_Sport_1313 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int N = io.nextInt();
        int[][] a = new int[N][N];

        int i, j, k;

        for (i = 0; i < N; ++i) {
            for (j = 0; j < N; ++j) {
                a[i][j] = io.nextInt();
            }
        }

        for (i = 0; i < 2 * N - 1; ++i) {
            for (j = 0; j <= i && j < N; ++j) {
                k = i - j;
                if (k >= 0 && k < N) {
                    io.writer.print(a[k][j]);
                    io.writer.print(" ");
                }
            }
        }

        io.shutdown();
    }
}
