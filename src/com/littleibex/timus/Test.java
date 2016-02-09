package com.littleibex.timus;

import com.littleibex.timus.utils.InputReader;
import com.littleibex.timus.utils.OutputWriter;

public class Test {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);

        writer.printLine("Hello World");

        writer.flush();
        writer.close();
    }
}
