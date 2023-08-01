// ex:- Question:- https://leetcode.com/problems/majority-element/description/

// When to use ?
// This algorithm returns us an element that might be a majority element.we need to check if it occurs more than N / 2 times only
// Finding the majority element: If you need to determine the element that appears more than n/2 times in an array where n is the size of the array),
// the Moore Algorithm is an efficient approach.
// Verifying the presence of a majority element: If you want to check if a majority element exists in an array without finding the actual element, the Moore Algorithm can 
// be used. It will return the potential majority element, or -1 (or any other sentinel value) if there is no majority element

// Intution:-
// Initially, we assume the first element of the array as the majority element candidate.
// As we iterate through the array, if we encounter an element different from the candidate, we decrement the count.
// If the count becomes zero, it means we have canceled out an equal number of majority and non-majority elements. In this case, we choose the current element as the new majority element candidate.
// If we encounter an element that matches the candidate, we increment the count since it is a potential candidate for the majority element.
// By continuously canceling out pairs of different elements, the majority element, if it exists, will eventually remain as the final candidate.

public int majorityElement3(int[] nums) {
//   count to check how many extra majority elements are there 
//   majorityElementd is max no of elements in array with more the n/2 size
    int count=0, majorityElement = 0;
    for (int num: nums) {
        if (count==0)
            majorityElement = num;
        if (num != majorityElement)
            count--;
        else
            count++;
    }
    return majorityElement;
}
