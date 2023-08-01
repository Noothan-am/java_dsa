
// Question:-
// https://leetcode.com/problems/move-zeroes/description/

// Solution:-
// https://leetcode.com/problems/move-zeroes/solutions/172432/the-easiest-but-unusual-snowball-java-solution-beats-100-o-n-clear-explanation/?orderBy=most_votes

public class gather_similar_number {
     // 1st approach
     public void moveZeroes(int[] nums) {
          int snowBallSize = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] == 0) {
                    snowBallSize++;
               } else if (snowBallSize > 0) {
                    int t = nums[i];
                    nums[i] = 0;
                    nums[i - snowBallSize] = t;
               }
          }
     }

     // 2nd approach
     // code

     public void moveZeroes2(int[] nums) {
          if (nums == null || nums.length == 0) {
               return;
          }

          int cur = 0;

          for (int i = 0; i < nums.length; ++i) {
               if (nums[i] != 0) {
                    int temp = nums[cur];
                    nums[cur++] = nums[i];
                    nums[i] = temp;
               }
          }
     }

}
