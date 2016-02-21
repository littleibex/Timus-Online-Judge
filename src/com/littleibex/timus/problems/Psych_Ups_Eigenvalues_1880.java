package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1880">1880. Psych Up's Eigenvalues</a>
 */
public class Psych_Ups_Eigenvalues_1880 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n1 = reader.readInt();
        int[] evalues1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            evalues1[i] = reader.readInt();
        }
        int n2 = reader.readInt();
        int[] evalues2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            evalues2[i] = reader.readInt();
        }
        int n3 = reader.readInt();
        int[] evalues3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            evalues3[i] = reader.readInt();
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

        writer.print(result);

        writer.flush();
        writer.close();
    }
}
