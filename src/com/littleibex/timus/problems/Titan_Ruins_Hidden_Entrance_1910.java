package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1910">1910. Titan Ruins: Hidden Entrance</a>
 */
public class Titan_Ruins_Hidden_Entrance_1910 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int n = io.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = io.nextInt();
        }

        int max = 0;
        int mid = 0;
        int sum;
        n -= 2;

        for (int i = 0; i < n; i++) {
            sum = a[i] + a[i + 1] + a[i + 2];
            if (sum > max) {
                max = sum;
                mid = i + 2;
            }
        }

        io.writer.print(max);
        io.writer.print(' ');
        io.writer.print(mid);

        io.shutdown();
    }
}
