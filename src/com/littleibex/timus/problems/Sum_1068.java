package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1068">1068. Sum</a>
 */
public class Sum_1068 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int N = io.nextInt();
        io.writer.print(N > 0 ? N * (N + 1) / 2 : N * (N - 1) / -2 + 1);

        io.shutdown();
    }
}
