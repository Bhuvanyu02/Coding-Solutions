import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;  // keep track of the total sum of the window
        int left = 0, result = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // Check if the window is valid
            // To make all elements equal to nums[right]:
            // required operations = nums[right] * windowSize - sumOfWindow
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            // Update result with the size of the valid window
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
