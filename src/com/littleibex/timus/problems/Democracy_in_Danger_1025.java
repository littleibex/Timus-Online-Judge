package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1025">1025. Democracy in Danger</a>
 */
public class Democracy_in_Danger_1025 {

    public static void main(String[] args) throws IOException {
        new Democracy_in_Danger_1025().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int i, j;

        int k = io.readPositiveInt();
        int[] a = new int[k];

        for (i = 0; i < k; i++) {
            a[i] = (io.readPositiveInt() + 1) >> 1;
        }

        int m;
        int r = 0;
        int n = (k + 1) >> 1;

        for (i = 0; i < n; i++) {
            m = i;
            for (j = i + 1; j < k; j++) {
                if (a[j] < a[m]) m = j;
            }
            r += a[m];
            a[m] = a[i];
        }

        io.writer.print(r);

        io.shutdown();
    }
}
