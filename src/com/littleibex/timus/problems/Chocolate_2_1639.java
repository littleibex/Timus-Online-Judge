package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1639">1639. Chocolate 2</a>
 */
public class Chocolate_2_1639 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        writer.print(((reader.readInt() * reader.readInt()) & 1) == 0 ? "[:=[first]" : "[second]=:]");

        writer.flush();
        writer.close();
    }
}
