package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1876">1876. Centipede's Morning</a>
 */
public class Centipedes_Morning_1876 {

    public static void main(String[] args) throws IOException {
        new Centipedes_Morning_1876().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();
        io.writer.print(Math.max(39 * 2 + 40 + (io.readPositiveInt() - 40) * 2 + 1, io.readPositiveInt() * 2 + 40));
        io.shutdown();
    }
}
