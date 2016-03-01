package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1225">1225. Flags</a>
 */
public class Flags_1225 {

    public static void main(String[] args) throws IOException {
        new Flags_1225().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readInt() - 2;
        long res = 2, n1 = 2, n2 = 2;
        while (n > 0) {
            res = n1 + n2;
            n1 = n2;
            n2 = res;
            n--;
        }
        io.writer.print(res);

        io.shutdown();
    }
}
