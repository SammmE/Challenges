package com.main;

import com.challenges.KthSmallestElement.KthSmallestElement;
import com.challenges.arrayDuplicate.ArrayDuplicate;
import com.challenges.groupAnagrams.GroupAnagrams;
import com.challenges.longestSubstring.LongestSubstring;
import com.challenges.reverseInt.ReverseInt;

public class Main {
    static Runner runner;

    public static void main(String[] args) {
//        run();
        GroupAnagrams anagrams = new GroupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        anagrams.start();
    }

    public static void run() {
        runner = new Runner();
        runner.addChallenge(new ArrayDuplicate());
        runner.addChallenge(new KthSmallestElement());
        runner.addChallenge(new LongestSubstring("pwwkew"));
        runner.addChallenge(new ReverseInt(-123));
        runner.addChallenge(new GroupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        runner.run();
    }
}
