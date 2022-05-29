package com.utils.challengeUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    static BufferedReader reader;

    public InputReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static String prompt(String promptMessage) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(promptMessage);
        String output = reader.readLine();

        return output;
    }
}
