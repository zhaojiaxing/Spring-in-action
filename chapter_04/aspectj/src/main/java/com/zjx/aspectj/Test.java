package com.zjx.aspectj;

/**
 * Created by zjx on 2018/7/2.
 */
public class Test {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    int[] a = {i,j};
                    return a;
                }
            }
        }
        return null;
    }
}
