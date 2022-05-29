package com.challenges.reverseInt;

import com.utils.Challenge;

public class ReverseInt implements Challenge {
    int x;
    int originalX;
    public ReverseInt(int revInt) {
        x = revInt;
        originalX = revInt;
    }

    @Override
    public void description() {
        System.out.println("2. Reverse Integer\n" +
                "\n" +
                "- Example 1:\n" +
                "Input: x = 123\n" +
                "Output: 321");
    }

    @Override
    public void start() {
        boolean positive = true;
        String revIntStr = "";

        if (x < 0) {
            positive = false;
        }

        x = Math.abs(x);
        String xStr = Integer.toString(x);
        char ch;

        for (int i = 0; i < xStr.length(); i++) {
            ch = xStr.charAt(i);
            revIntStr = ch + revIntStr;
        }

        int revInt = Integer.parseInt(revIntStr);
        if (!positive) {
            revInt = 0 - revInt;
        }

        System.out.println("The reversed integer of " + originalX + " is " + revInt);
    }
}
