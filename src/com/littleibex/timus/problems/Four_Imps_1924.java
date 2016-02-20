package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;
import com.littleibex.timus.utils.OutputWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1924">1924. Four Imps</a>
 */
public class Four_Imps_1924 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);

        writer.print((((reader.readInt() - 1) >> 1) & 1) == 0 ? "grimy" : "black");

        writer.flush();
        writer.close();
    }
}
