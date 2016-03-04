package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1327">1327. Fuses</a>
 */
public class Fuses_1327 {

    public static void main(String[] args) throws IOException {
        new Fuses_1327().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int a = io.readPositiveInt();
        int b = io.readPositiveInt();

        if ((a & 1) != 0) a--;
        if ((b & 1) != 0) b++;

        io.writer.print((b - a) / 2);

        io.shutdown();
    }
}
