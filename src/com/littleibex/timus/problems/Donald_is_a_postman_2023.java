package com.littleibex.timus.problems;

import com.littleibex.timus.utils.InputReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.InvalidParameterException;

/**
 * @see <a href="http://acm.timus.ru/problem.aspx?space=1&num=2023">2023. Donald is a postman</a>
 */
public class Donald_is_a_postman_2023 {

    public static void main(String[] args) throws Exception {
        InputReader reader = new InputReader(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        writer.print(new Donald_is_a_postman_2023().solve(reader));

        writer.flush();
        writer.close();
    }

    public int solve(InputReader reader) {
        int n = reader.readInt();

        int temp = 1, result = 0, position;

        for (int i = 0; i < n; i++) {
            position = getPosition(reader.readString());
            result += Math.abs(temp - position);
            temp = position;
        }

        return result;
    }

    private int getPosition(String name) {
        switch (name) {
            case "Alice":
            case "Phil":
            case "Phoebus":
            case "Ariel":
            case "Peter":
            case "Ralph":
            case "Aurora":
            case "Olaf":
            case "Robin":
                return 1;

            case "Bambi":
            case "Mulan":
            case "Silver":
            case "Belle":
            case "Mowgli":
            case "Simba":
            case "Bolt":
            case "Mickey":
            case "Stitch":
                return 2;

            case "Dumbo":
            case "Kuzko":
            case "Tarzan":
            case "Genie":
            case "Kida":
            case "Tiana":
            case "Jiminy":
            case "Kenai":
            case "Winnie":
                return 3;
        }
        throw new InvalidParameterException();
    }
}
