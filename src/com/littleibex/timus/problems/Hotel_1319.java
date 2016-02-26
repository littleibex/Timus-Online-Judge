package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1068">1068. 1, 10, 100, 1000...</a>
 */
public class Hotel_1319 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = reader.readInt();
        int rows = N * 2 - 1;
        int[][] a = new int[rows][N];
        int count = 1;

        for (int i = 0; i < rows; i++) {
            int y = Math.min(i, N - 1);
            for (int j = Math.max(0, i - N + 1); j <= y; j++) {
                a[i][j] = count++;
            }
        }

        count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                if (a[j][i] > 0) {
                    writer.print(a[j][i]);
                    if (count % N == 0) {
                        writer.println();
                    } else {
                        writer.print(' ');
                    }
                    count++;
                }
            }
        }

        writer.flush();
        writer.close();
    }
}
