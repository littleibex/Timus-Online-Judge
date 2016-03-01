package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1263">1263. Elections</a>
 */
public class Elections_1263 {

    public static void main(String[] args) throws IOException {
        new Elections_1263().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readPositiveInt();
        int[] a = new int[n + 1];
        int m = io.readPositiveInt();

        for (int i = 0; i < m; i++) {
            a[io.readPositiveInt()]++;
        }

        for (int i = 1; i <= n; i++) {
            io.writer.printf("%.2f%%\n", (float) a[i] / m * 100.0);
        }

        io.shutdown();
    }
}
