package com.athome.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangxw03
 * @Dat 2021-01-19 10:40
 * @Describe [2, 3, 5, 11] 8
 */
public class Test2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 3};
        int target = 9;
        int[] count = Test2.count(nums, target);
        for (int i : count) {
            System.out.println(i);
        }

    }

    public static int[] count(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
