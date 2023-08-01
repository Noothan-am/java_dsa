import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(findNum(arr,0,4));
    }
    static ArrayList<Integer> findNum(int[] arr, int index,int target)
    {
        ArrayList<Integer> list = new ArrayList<>(); // creates new ArrayList on each call and stores its own value
        
        if(index == arr.length)
        {
            return list;
        }
        else if(arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> finalList = findNum(arr, index+1, target); // gets the new value in list of previous reccursion call and stores in new ArrayList 
        list.addAll(finalList); // adds all the finalist elements to list ArrayList 
        return list; 
    }
}
