package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;
import com.littleibex.timus.utils.InputReader;
import com.littleibex.timus.utils.OutputWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1910">1910. Titan Ruins: Hidden Entrance</a>
 */
public class Titan_Ruins_Hidden_Entrance_1910 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);

        int n = reader.readInt();
        int[] a = IOUtils.readIntArray(reader, n);

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

        writer.print(max);
        writer.print(' ');
        writer.print(mid);

        writer.flush();
        writer.close();
    }
}
