package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1197">1197. Lonesome Knight</a>
 */
public class Lonesome_Knight_1197 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = reader.readInt();

        for (int i = 1; i <= N; i++) {
            String p = reader.readString();
            writer.println(new Lonesome_Knight_1197().solve(p));
        }

        writer.flush();
        writer.close();
    }

    public int solve(String position) {
        int m = alphabetAsNumber(position.charAt(0));
        int n = Character.getNumericValue(position.charAt(1));

        return validatePosition(m - 2, n - 1)
                + validatePosition(m + 2, n - 1)
                + validatePosition(m - 2, n + 1)
                + validatePosition(m + 2, n + 1)
                + validatePosition(m - 1, n + 2)
                + validatePosition(m - 1, n - 2)
                + validatePosition(m + 1, n + 2)
                + validatePosition(m + 1, n - 2);
    }

    private int validatePosition(int m, int n) {
        return m >= 1 && m <= 8 && n >= 1 && n <= 8 ? 1 : 0;
    }

    private int alphabetAsNumber(int c) {
        return c - 96;
    }
}
