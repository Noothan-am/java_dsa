
**Question:-**

https://leetcode.com/problems/sort-colors/description/ 

**Tutorial**

https://www.youtube.com/watch?v=tp8JIuCXBaU

**What is it..?**

 Is sorting algorithm used to sort an array containing three distinct values whare you are sorting any array with three distinct values

**whare to use:-**

 The Dutch National Flag algorithm can efficiently sort an array of colored objects by color, represented by three distinct values such as red, green, and blue.
 It can also be used to efficiently partition an array of elements into three groups based on a criterion, such as categorizing students into excellent, average, 
 and below average.

**Steps:-**

 1.Initially, the low and mid pointers are set to the start of the array, and the high pointer is set to the end of the array.
 
 2.While the mid pointer is less than or equal to the high pointer:
 
  - If the element at the mid pointer is smaller than the low, swap it with the element at the low pointer and increment both the mid and low pointers.
   
  - If the element at the mid pointer is equal to the , increment only the mid pointer.
  
  - If the element at the mid pointer is larger than the pivot value, swap it with the element at the high pointer and decrement the high pointer.
  
 3.Repeat this process until the mid pointer crosses the high pointer, indicating that all elements have been processed.

 [0,0,0,0,1,1,1,1,0,2,1,2,0,2,2,2]      // [0, low - 1] 
 0      | |     | |notsort| |   |       // [low, mid - 1]
 l    l-1 l   m-1 m       h h+1 2       // [high + 1, n] 

**Rules:-**

![image](https://github.com/Noothan-am/learning/assets/100135382/a287dec6-abdd-4905-bcb8-630399ff1721)

**code**

![image](https://github.com/Noothan-am/learning/assets/100135382/65003c29-3b24-489d-bdf9-e93913be93be)

