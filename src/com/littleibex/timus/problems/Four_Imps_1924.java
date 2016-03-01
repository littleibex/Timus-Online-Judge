package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1924">1924. Four Imps</a>
 */
public class Four_Imps_1924 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        io.writer.print((((io.nextInt() - 1) >> 1) & 1) == 0 ? "grimy" : "black");

        io.shutdown();
    }
}
