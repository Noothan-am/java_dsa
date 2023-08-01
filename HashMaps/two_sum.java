// QUESTION: https://leetcode.com/problems/two-sum/description/

// My approach:
public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        int n = arr.length - 1;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j <= n; j++) {
                if(arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }                
            }
        }
        return res;
    }


// Solution: 
public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
