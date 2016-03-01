package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1209">1209. 1, 10, 100, 1000...</a>
 */
public class One_Ten_Hundred_Thousand_1209 {

    public static void main(String[] args) throws IOException {
        new One_Ten_Hundred_Thousand_1209().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int N = io.nextInt();
        for (int i = 0; i < N; i++) {
            io.writer.print(isPerfectSquare(8 * (double) io.nextInt() - 7) ? "1 " : "0 ");
        }

        io.shutdown();
    }

    private boolean isPerfectSquare(double n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
