// main code for Subsequences

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


