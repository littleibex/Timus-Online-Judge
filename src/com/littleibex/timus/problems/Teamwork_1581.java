package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1581">1581. Teamwork</a>
 */
public class Teamwork_1581 {

    public static void main(String[] args) throws IOException {
        new Teamwork_1581().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readInt();
        int x;
        int count = 1;

        int prev = io.readInt();
        n--;

        while (n > 0) {
            x = io.readInt();
            if (x != prev) {
                io.writer.print(count);
                io.writer.print(' ');
                io.writer.print(prev);
                io.writer.print(' ');
                count = 0;
            }
            count++;
            prev = x;
            n--;
        }
        io.writer.print(count);
        io.writer.print(' ');
        io.writer.print(prev);

        io.shutdown();
    }
}
