package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1083">1083. Factorials!!!</a>
 */
public class Factorials_1083 {

    public static void main(String[] args) throws IOException {
        new Factorials_1083().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int k = 0;
        int r = 1;

        int n = io.readPositiveInt();
        while (io.read() == '!') k++;

        for (int i = n; i > 0; i -= k) {
            r *= i;
        }

        io.writer.print(r);

        io.shutdown();
    }
}
