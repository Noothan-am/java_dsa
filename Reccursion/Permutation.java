

// Here we are placing all other element in one index 

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, nums, ans);
        return ans;
    }
    public void find(int ind, int[] nums, List<List<Integer>> ans) {
        int n = nums.length;
        if(ind == n) {
            List<Integer> dc = new ArrayList<>();
            for(int f:nums) {
                dc.add(f);
            }
            ans.add(dc);
        }
        for(int i = ind; i < n; i++) {
            swap(ind, i, nums);
            find(ind+1, nums, ans);
            swap(ind, i, nums);
        }
    }
    public void swap(int ind, int i, int[] nums) {
        int temp = nums[ind];
        nums[ind] = nums[i];
        nums[i] = temp;
    }
}

