package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=2001">2001. Mathematicians and Berries</a>
 */
public class Mathematicians_and_Berries_2001 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int a1 = io.nextInt();
        int b1 = io.nextInt();
        io.nextInt();
        int b2 = io.nextInt();
        int a3 = io.nextInt();
        io.nextInt();

        io.writer.print(a1 - a3);
        io.writer.print(" ");
        io.writer.print(b1 - b2);

        io.shutdown();
    }
}
