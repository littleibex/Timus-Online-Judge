package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1910">1910. Titan Ruins: Hidden Entrance</a>
 */
public class Titan_Ruins_Hidden_Entrance_1910 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = reader.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = reader.readInt();
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

        writer.print(max);
        writer.print(' ');
        writer.print(mid);

        writer.flush();
        writer.close();
    }
}
