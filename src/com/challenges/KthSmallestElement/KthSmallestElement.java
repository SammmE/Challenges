package com.challenges.KthSmallestElement;

import com.utils.Challenge;
import com.utils.challengeUtils.InputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement implements Challenge {
    @Override
    public void description() {
        System.out.println("Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.\n" +
                "\n" +
                "Input:\n" +
                "N = 6\n" +
                "arr[] = 7 10 4 3 20 15\n" +
                "K = 3\n" +
                "Output : 7\n" +
                "Explanation :\n" +
                "3rd smallest element in the given\n" +
                "array is 7.");
    }

    @Override
    public void start() {
        String arrayString = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
        char[] charArr = arrayString.toCharArray();
        int k = 0;

        try {
            arrayString = InputReader.prompt("array: ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        charArr = arrayString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            String ch = String.valueOf(charArr[i]);
            int num = Integer.parseInt(ch);
            arr.add(num);
        }

        Collections.sort(arr);
        try {
            k = Integer.parseInt(InputReader.prompt("array: "));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(arr.get(k - 1));
    }
}
