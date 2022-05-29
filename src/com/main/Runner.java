package com.main;

import com.utils.Challenge;
import com.utils.challengeUtils.InputReader;

import java.io.IOException;
import java.util.ArrayList;

public class Runner {
    ArrayList<Challenge> programs = new ArrayList<Challenge>();

    public void addChallenge(Challenge challenge) {
        programs.add(challenge);
    }

    public static void runChallenge(Challenge challenge) {
        int action = 0;
        try {
            String actionStr = InputReader.prompt("TYPE 1 TO RUN PROGRAM\nTYPE 2 to READ DESCRIPTION\n> ");
            try {
                action = Integer.parseInt(actionStr);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (action != 1 && action != 2) {
            System.err.println("Enter 1 or 2");
        } else if (action == 1) {
            challenge.start();
        } else {
            challenge.description();
            try {
                InputReader.prompt("Press enter to start");
                challenge.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String format(String toFormat) {
        toFormat = toFormat.toLowerCase();
        toFormat.replace(" ", "");

        return toFormat;
    }

    public void run() {
        String programName = "";

        try {
            System.out.println("Programs: ");
            for (Challenge challenge : programs) {
                System.out.println("- " + challenge.getClass().getSimpleName());
            }
            programName = InputReader.prompt("Program: ");
        } catch (IOException e) {
            System.err.println("Could not read command line...\n\n");
            e.printStackTrace();
        }
        programName = Runner.format(programName);

        for (Challenge challenge : programs) {
            String chalName = format(challenge.getClass().getSimpleName());
            if (chalName.equalsIgnoreCase(programName)) {
                runChallenge(challenge);
            }
        }
    }
}