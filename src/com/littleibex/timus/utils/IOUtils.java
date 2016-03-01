package com.littleibex.timus.utils;

import java.io.*;
import java.util.StringTokenizer;

public class IOUtils {

    public PrintWriter writer;
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public IOUtils() {
        reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        tokenizer = new StringTokenizer("");
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    public int read() throws IOException {
        return reader.read();
    }

    public String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public void shutdown() {
        writer.flush();
        writer.close();
    }
}
