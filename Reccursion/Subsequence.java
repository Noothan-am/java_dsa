// main code for Subsequences

// PATTERN ONE PICK AND NOT PICK

import java.util.*;
class Subsequence {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        give(arr, 3, 0, new ArrayList<>());
    }
    public static void give(int[] arr, int n, int i, ArrayList<Integer> res) {
        if(i==n) {
            System.out.println(res);    
            return;
        } 
        res.add(arr[i]);
        give(arr, n, i+1, res);
        res.remove(res.size() - 1);
        give(arr, n, i+1, res);
    }
}

// all other pattern for Subsequence


// Subsets with sum 2

class SubsequenceSum {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        give(arr, 3, 0, new ArrayList<>(), 0);
    }
    public static void give(int[] arr, int n, int i, ArrayList<Integer> res, int sum) {
        if(i == n){
            if(sum == 2) System.out.println(res);    
            return;
        }
        res.add(arr[i]);
        give(arr, n, i+1, res, sum+arr[i]);
        res.remove(res.size()-1);
        give(arr, n, i+1, res, sum);
    }
}


// count the no of subseq with sum = 2

class SubsequenceSum {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int value = give(arr, 3, 0, 0);
        System.out.println(value); 
    }
    public static int give(int[] arr, int n, int i, int sum) {
        if(i==n) {
            if(sum == 2) return 1;
            return 0;
        }
        int left = give(arr, n, i+1, sum+arr[i]);
        int right = give(arr, n, i+1, sum);
        return left+right;
    }
}

// if we want the sum in repeating values the we donot increment it by i+1 

class Solution {
    private void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds); // here we are not incrementing index
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}


// PATTERN TWO WITHOUGHT DUPLICATES 
    // ex  [[1,2,3], [1,2,2]] not possible because at 0th index both array has 1

// this is for unique combinations withought duplicates  

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array to handle duplicates
        find(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    public void find(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                find(i + 1, candidates, target - candidates[i], current, res);
                current.remove(current.size() - 1); 
            }
        }
    }
}



