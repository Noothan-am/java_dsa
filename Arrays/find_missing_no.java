// Question:- 
// https://leetcode.com/problems/missing-number/solutions/?orderBy=most_votes

// Approach:-
// Pretty simple since we are told that we are missing only one number in [1,n], we just need to look at the difference between the 
// sum([1,n]) = n * (n+1) / 2 and the sum of nums in our array.

// solution:- 
// https://leetcode.com/problems/missing-number/solutions/69795/java-solution-o-1-space-and-o-n-in-time/?orderBy=most_votes&languageTags=java
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
}
