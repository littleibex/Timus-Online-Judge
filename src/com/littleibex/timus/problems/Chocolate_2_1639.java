package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1639">1639. Chocolate 2</a>
 */
public class Chocolate_2_1639 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        io.writer.print(((io.nextInt() * io.nextInt()) & 1) == 0 ? "[:=[first]" : "[second]=:]");

        io.shutdown();
    }
}
