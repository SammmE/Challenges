package com.challenges.arrayDuplicate;

import com.utils.Challenge;
import com.utils.challengeUtils.InputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDuplicate implements Challenge {
    @Override
    public void description() {
        System.out.println("Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.\n" +
                "\n" +
                "Input:\n" +
                "N = 5\n" +
                "a[] = {2,3,1,2,3}\n" +
                "Output: 2 3\n" +
                "Explanation: 2 and 3 occur more than once\n" +
                "in the given array.");
    }

    @Override
    public void start() {
        String arrayString = "";
        ArrayList<Integer> repeat = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        char[] charArr = arrayString.toCharArray();
        boolean finished = false;

        System.out.println("DO NOT SEPARATE ARRAY ITEMS");
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
        for (int i = 0; i < arr.size() - 1; i++) {
            if (finished) {
                break;
            }
            for (int j = 0; i < arr.size() - i - 1; j++) {
                if (j == arr.size() - 1) {
                    finished = true;
                }
                if (finished) {
                    break;
                }
                try {
                    int n1 = arr.get(j);
                    int n2 = arr.get(j + 1);
                    if (arr.get(j) == arr.get(j + 1)) {
                        repeat.add(arr.get(j));
                        repeat.add(arr.get(j));
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 0; i < repeat.size(); i++) {
            System.out.println(repeat.get(i));
        }
    }
}
