package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=2001">2001. Mathematicians and Berries</a>
 */
public class Mathematicians_and_Berries_2001 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int a1 = reader.readInt();
        int b1 = reader.readInt();
        reader.readInt();
        int b2 = reader.readInt();
        int a3 = reader.readInt();
        reader.readInt();

        writer.print(a1 - a3);
        writer.print(" ");
        writer.print(b1 - b2);

        writer.flush();
        writer.close();
    }
}
