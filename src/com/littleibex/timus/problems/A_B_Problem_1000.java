package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1000">1000. A+B Problem</a>
 */
public class A_B_Problem_1000 {

    public static void main(String[] args) throws IOException {
        new A_B_Problem_1000().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();
        io.writer.print(io.readInt() + io.readInt());
        io.shutdown();
    }
}
