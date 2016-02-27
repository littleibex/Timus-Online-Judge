package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1567">1567. SMS-spam</a>
 */
public class SMS_spam_1567 {

    public static void main(String[] args) throws Exception {
        new SMS_spam_1567().run();
    }

    public void run() throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int cost = 0;
        int c = reader.read();
        while (c != '\n') {
            cost += getCharCost(c);
            c = reader.read();
        }
        writer.print(cost);

        writer.flush();
        writer.close();
    }

    public int getCharCost(int c) {
        switch (c) {
            case 'a':
            case 'd':
            case 'g':
            case 'j':
            case 'm':
            case 'p':
            case 's':
            case 'v':
            case 'y':
            case '.':
            case ' ':
                return 1;

            case 'b':
            case 'e':
            case 'h':
            case 'k':
            case 'n':
            case 'q':
            case 't':
            case 'w':
            case 'z':
            case ',':
                return 2;

            case 'c':
            case 'f':
            case 'i':
            case 'l':
            case 'o':
            case 'r':
            case 'u':
            case 'x':
            case '!':
                return 3;

            default:
                return 0;
        }
    }
}
