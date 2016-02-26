package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1209">1209. 1, 10, 100, 1000...</a>
 */
public class One_Ten_Hundred_Thousand_1209 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        new One_Ten_Hundred_Thousand_1209().solve(reader, writer);

        writer.flush();
        writer.close();
    }

    public void solve(InputReader reader, PrintWriter writer) throws Exception {
        int N = reader.readInt();
        for (int i = 0; i < N; i++) {
            writer.print(isPerfectSquare(8 * (double) reader.readInt() - 7) ? "1 " : "0 ");
        }
    }

    private boolean isPerfectSquare(double n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
