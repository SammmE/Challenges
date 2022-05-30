package com.challenges.groupAnagrams;

import com.utils.Challenge;
import com.utils.challengeUtils.ArrayTransform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams implements Challenge {
    ArrayList<String> strs;
    ArrayList<String> oldStrs;

    public GroupAnagrams(String[] words) {
        strs = ArrayTransform.ArrayToArrayList(words);
        oldStrs = ArrayTransform.ArrayToArrayList(words);
    }

    @Override
    public void description() {
        System.out.println("3. Group Anagrams\n" +
                "Given an array of strings strs, group the anagrams together. You can return the answer in any order.\n" +
                "\n" +
                "An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.\n" +
                "\n" +
                "Example 1:\n" +
                "Input: strs = [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]\n" +
                "Output: [[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]");
    }

    @Override
    public void start() {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();
        ArrayList<String> wrds = new ArrayList<>();

        for (String str : strs) {
            char[] charsInWord = str.toCharArray();
            Arrays.sort(charsInWord);
            for (String word : strs) {
                if (word.length() == str.length()) {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    if (Arrays.equals(charsInWord, chars)) {
                        wrds.add(word);
//                        strs.remove(0);
                    }
                }
            }
            anagrams.put(new String(charsInWord), wrds);
            wrds = new ArrayList<>();
        }

        System.out.println(anagrams);
    }
}
