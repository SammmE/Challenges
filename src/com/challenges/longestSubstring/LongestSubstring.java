package com.challenges.longestSubstring;

import com.utils.Challenge;

import java.util.ArrayList;

public class LongestSubstring implements Challenge {
    String s;
    String originalS;

    public LongestSubstring(String x) {
        s = x;
        originalS = x;
    }

    @Override
    public void description() {
        System.out.println("3.Longest Substring Without Repeating Characters\n" +
                "Given a string s, find the length of the longest substring without repeating characters.\n" +
                "\n" +
                "- Example 1:\n" +
                "Input: s = \"abcabcbb\"\n" +
                "Output: 3\n" +
                "Explanation: The answer is \"abc\", with the length of 3.");
    }

    @Override
    public void start() {
        ArrayList<Character> used = new ArrayList<Character>();
        ArrayList<String> subStrs = new ArrayList<String>();
        String str = "";
        while (!s.equalsIgnoreCase("")) {
            char ltr = s.charAt(0);
            for (char letter : used) {
                if (ltr == letter) {
                    subStrs.add(str);
                    used = new ArrayList<Character>();
                    str = "";
                }
            }
            str = str + Character.toString(ltr);
            used.add(ltr);

            s = s.substring(1);
        }

        String longest = "";
        int longestLength = 0;
        for (String subStr : subStrs) {
            if (subStr.length() > longestLength) {
                longest = subStr;
                longestLength = subStr.length();
            }
        }

        System.out.println("The longest substring in " + originalS + " is " + longest + " with a length of " + longestLength);
    }
}
