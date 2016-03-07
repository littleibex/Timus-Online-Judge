package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1293">1293. Eniya</a>
 */
public class Eniya_1293 {

    public static void main(String[] args) throws IOException {
        new Eniya_1293().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();
        io.writer.print((io.readPositiveInt() << 1) * io.readPositiveInt() * io.readPositiveInt());
        io.shutdown();
    }
}
