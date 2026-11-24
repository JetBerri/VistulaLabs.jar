package com.example.task;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        // int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] nums = {1, 2, 4, 3, 5, 6, 7, 9, 8, 10};

        System.out.println("Before: ");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(nums));
    }
}