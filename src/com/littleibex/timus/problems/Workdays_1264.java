package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1264">1264. Workdays</a>
 */
public class Workdays_1264 {

    public static void main(String[] args) throws Exception {
        IOUtils io = new IOUtils();

        io.writer.print(io.readInt() * (io.readInt() + 1));

        io.shutdown();
    }
}
