package com.littleibex.timus.utils;

import java.io.IOException;

public class IOUtils {

    public static String readString() throws IOException {
        int c = System.in.read();
        while (isSpaceChar(c))
            c = System.in.read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = System.in.read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public static int readInt() throws IOException {
        int i = 0;
        int c = System.in.read();
        while (isSpaceChar(c))
            c = System.in.read();
        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = System.in.read();
        }
        do {
            i = i * 10 + c - '0';
            c = System.in.read();
        } while (!isSpaceChar(c));
        return i * sign;
    }

    public static int readPositiveInt() throws IOException {
        int i = 0;
        int c = System.in.read();
        while (isSpaceChar(c))
            c = System.in.read();
        do {
            i = i * 10 + c - '0';
            c = System.in.read();
        } while (!isSpaceChar(c));
        return i;
    }

    private static boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }
}
