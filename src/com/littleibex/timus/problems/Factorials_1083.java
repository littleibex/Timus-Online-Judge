package com.littleibex.timus.problems;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1083">1083. Factorials!!!</a>
 */
public class Factorials_1083 {

    public static void main(String[] args) throws IOException {
        new Factorials_1083().run();
    }

    public void run() throws IOException {
        int c, n = 0, k = 0, f = 1;

        while ((c = System.in.read()) != ' ') {
            n = n * 10 + c - '0';
        }
        while (System.in.read() == '!') k++;
        while (n > 0) {
            f *= n;
            n -= k;
        }
        System.out.print(f);
    }
}
