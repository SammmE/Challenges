package com.utils.challengeUtils;

import java.util.ArrayList;

public class ArrayTransform {
    public static <type> ArrayList ArrayToArrayList(Object[] arr) {
        ArrayList<type> arrList = new ArrayList<>();
        for (Object obj : arr) {
            arrList.add((type) obj);
        }
        return arrList;
    }
}
