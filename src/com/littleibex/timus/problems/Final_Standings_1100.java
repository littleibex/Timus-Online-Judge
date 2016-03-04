package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1100">1100. Final Standings</a>
 */
public class Final_Standings_1100 {

    public static void main(String[] args) throws IOException {
        new Final_Standings_1100().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readPositiveInt();
        String id;

        List<String>[] teams = new ArrayList[101];
        for (int i = 0; i <= 100; i++) {
            teams[i] = new ArrayList<>();
        }

        while (n > 0) {
            id = io.readString();
            teams[io.readPositiveInt()].add(id);
            n--;
        }

        for (int i = 100; i >= 0; i--) {
            for (String team : teams[i]) {
                io.writer.print(team);
                io.writer.print(' ');
                io.writer.println(i);
            }
        }

        io.shutdown();
    }
}
