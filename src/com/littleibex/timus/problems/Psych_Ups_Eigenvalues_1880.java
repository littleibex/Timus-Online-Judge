package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;

import java.io.IOException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1880">1880. Psych Up's Eigenvalues</a>
 */
public class Psych_Ups_Eigenvalues_1880 {

    public static void main(String[] args) throws IOException {
        IOUtils io = new IOUtils();

        int n1 = io.readInt();
        int[] evalues1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            evalues1[i] = io.readInt();
        }
        int n2 = io.readInt();
        int[] evalues2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            evalues2[i] = io.readInt();
        }
        int n3 = io.readInt();
        int[] evalues3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            evalues3[i] = io.readInt();
        }

        int i = 0, j = 0, k = 0, result = 0;

        while (i < n1) {
            int ev1 = evalues1[i];
            int occurrences = 0;

            while (j < n2) {
                int ev2 = evalues2[j];
                if (ev2 == ev1) {
                    occurrences++;
                    j++;
                    break;
                } else if (ev2 > ev1) {
                    break;
                }
                j++;
            }

            while (k < n3) {
                int ev3 = evalues3[k];
                if (ev3 == ev1) {
                    occurrences++;
                    k++;
                    break;
                } else if (ev3 > ev1) {
                    break;
                }
                k++;
            }

            if (occurrences == 2) {
                result++;
            }

            i++;
        }

        io.writer.print(result);

        io.shutdown();
    }
}
