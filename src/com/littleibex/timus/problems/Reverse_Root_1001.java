package com.littleibex.timus.problems;

import java.io.*;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1001">1001. Reverse Root</a>
 */
public class Reverse_Root_1001 {

    public static void main(String[] args) throws IOException {
        new Reverse_Root_1001().run();
    }

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int c;
        Node current;
        Node top = new Node();
        top.n = 0;
        boolean proceed = false;
        while ((c = reader.read()) != -1) {
            if (isSpaceChar(c)) {
                if (proceed) {
                    current = top;
                    top = new Node();
                    top.n = 0;
                    top.prev = current;
                    proceed = false;
                }
            } else {
                top.n = top.n * 10 + c - '0';
                proceed = true;
            }
        }
        if (!proceed) {
            top = top.prev;
        }
        while (top != null) {
            writer.printf("%.4f\n", Math.sqrt(top.n));
            top = top.prev;
        }
        writer.flush();
        writer.close();
    }

    private boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    private static class Node {
        public Node prev;
        public long n;
    }
}
