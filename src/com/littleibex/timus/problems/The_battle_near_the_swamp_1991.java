package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1991">1991. The battle near the swamp</a>
 */
public class The_battle_near_the_swamp_1991 {

    public static void main(String[] args) throws IOException {
        new The_battle_near_the_swamp_1991().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readPositiveInt();
        int k = io.readPositiveInt();
        int i;
        int x = 0, y = 0;

        while (n > 0) {
            i = io.readPositiveInt();
            if (i > k) {
                x += i - k;
            } else {
                y += k - i;
            }
            n--;
        }

        io.writer.print(x);
        io.writer.print(' ');
        io.writer.print(y);

        io.shutdown();
    }
}
