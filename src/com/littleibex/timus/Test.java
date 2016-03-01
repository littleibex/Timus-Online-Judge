package com.littleibex.timus;

import com.littleibex.timus.utils.IOUtils;

public class Test {

    public static void main(String[] args) throws Exception {
        IOUtils io = new IOUtils();

        io.writer.print(io.next());

        io.shutdown();
    }
}
