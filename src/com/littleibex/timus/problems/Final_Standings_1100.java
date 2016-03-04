package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1100">1100. Final Standings</a>
 */
public class Final_Standings_1100 {

    private Team[] teams;
    private Team[] tmp;

    private int i, j;

    public static void main(String[] args) throws IOException {
        new Final_Standings_1100().run();
    }

    public void run() throws IOException {
        IOUtils io = new IOUtils();

        int n = io.readPositiveInt();
        teams = new Team[n];

        for (i = 0; i < n; i++) {
            teams[i] = new Team();
            teams[i].id = io.readString();
            teams[i].score = io.readPositiveInt();
        }

        tmp = new Team[n];

        mergesort(0, n - 1);

        for (i = 0; i < n; i++) {
            io.writer.print(teams[i].id);
            io.writer.print(' ');
            io.writer.println(teams[i].score);
        }

        io.shutdown();
    }

    private void mergesort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergesort(p, q);
            mergesort(q + 1, r);
            merge(p, q, r);
        }
    }

    private void merge(int p, int q, int r) {
        for (i = p; i <= r; i++) {
            tmp[i] = teams[i];
        }
        i = p;
        j = q + 1;
        while (i <= q && j <= r) {
            if (tmp[i].score >= tmp[j].score) {
                teams[p++] = tmp[i++];
            } else {
                teams[p++] = tmp[j++];
            }
        }
        while (i <= q) {
            teams[p++] = tmp[i++];
        }
    }

    private static class Team {
        public String id;
        public int score;
    }
}
