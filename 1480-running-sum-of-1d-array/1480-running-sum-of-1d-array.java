import java.util.*;
import java.io.*;

class Solution {
    public int[] runningSum(int[] nums) {
        int N = nums.length;
        
        int[] result = new int[N];
        result[0] = nums[0];
        for (int i = 1; i < N; i++) {
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }
}