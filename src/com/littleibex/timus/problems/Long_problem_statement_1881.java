package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1881">1881. Long problem statement</a>
 */
public class Long_problem_statement_1881 {

    public static void main(String[] args) throws IOException {
        new Long_problem_statement_1881().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int h = io.readPositiveInt();
        int w = io.readPositiveInt();
        int n = io.readPositiveInt();

        int lines = 1, spaces = -1, chars;
        while (n > 0) {
            chars = 1;

            while (io.isSpaceChar(io.read())) ;
            while (!io.isSpaceChar(io.read())) chars++;

            if (spaces + chars + 1 > w) {
                lines++;
                spaces = -1;
            }
            spaces += chars + 1;

            n--;
        }

        io.writer.print(lines / h + (lines % h == 0 ? 0 : 1));

        io.shutdown();
    }
}
