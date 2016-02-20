package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;
import com.littleibex.timus.utils.OutputWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1639">1639. Chocolate 2</a>
 */
public class Chocolate_2_1639 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);

        writer.print(((reader.readInt() * reader.readInt()) & 1) == 0 ? "[:=[first]" : "[second]=:]");

        writer.flush();
        writer.close();
    }
}
