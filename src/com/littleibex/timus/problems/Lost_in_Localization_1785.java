package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1785">1785. Lost in Localization</a>
 */
public class Lost_in_Localization_1785 {

    public static void main(String[] args) throws IOException {
        new Lost_in_Localization_1785().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readPositiveInt();

        if (n >= 1000) {
            io.printString('l', 'e', 'g', 'i', 'o', 'n');
        } else if (n >= 500) {
            io.printString('z', 'o', 'u', 'n', 'd', 's');
        } else if (n >= 250) {
            io.printString('s', 'w', 'a', 'r', 'm');
        } else if (n >= 100) {
            io.printString('t', 'h', 'r', 'o', 'n', 'g');
        } else if (n >= 50) {
            io.printString('h', 'o', 'r', 'd', 'e');
        } else if (n >= 20) {
            io.printString('l', 'o', 't', 's');
        } else if (n >= 10) {
            io.printString('p', 'a', 'c', 'k');
        } else if (n >= 5) {
            io.printString('s', 'e', 'v', 'e', 'r', 'a', 'l');
        } else if (n >= 1) {
            io.printString('f', 'e', 'w');
        }

        io.shutdown();
    }
}
