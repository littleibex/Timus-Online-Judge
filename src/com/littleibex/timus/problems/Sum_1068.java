package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1068">1068. Sum</a>
 */
public class Sum_1068 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = reader.readInt();
        writer.print(N > 0 ? N * (N + 1) / 2 : N * (N - 1) / -2 + 1);

        writer.flush();
        writer.close();
    }
}
