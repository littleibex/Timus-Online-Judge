package com.littleibex.timus.problems;

import com.littleibex.timus.utils.IOUtils;
import com.littleibex.timus.utils.InputReader;
import com.littleibex.timus.utils.OutputWriter;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=1880">1880. Psych Up's Eigenvalues</a>
 */
public class Psych_Ups_Eigenvalues_1880 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);

        int n1 = reader.readInt();
        int[] evalues1 = IOUtils.readIntArray(reader, n1);
        int n2 = reader.readInt();
        int[] evalues2 = IOUtils.readIntArray(reader, n2);
        int n3 = reader.readInt();
        int[] evalues3 = IOUtils.readIntArray(reader, n3);

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
