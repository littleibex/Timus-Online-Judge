package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1409">1409. Two Gangsters</a>
 */
public class Two_Gangsters_1409 {

    public static void main(String[] args) throws IOException {
        new Two_Gangsters_1409().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();
        int a = io.readPositiveInt();
        int b = io.readPositiveInt();
        io.writer.print(b - 1);
        io.writer.print(' ');
        io.writer.print(a - 1);
        io.shutdown();
    }
}
