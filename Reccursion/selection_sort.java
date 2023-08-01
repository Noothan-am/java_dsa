import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {9,7,8,6,6,4,4,3,2,1,0};
        bubbleSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int cur, int length,int max)
    {   
        if(length-1 == 1)
        {
            return;
        }
        else if(cur < length-1)
        {   
            if(arr[cur] > arr[max])
            {
                max = cur;
                bubbleSort(arr,cur+1,length,max);
            }
            bubbleSort(arr,cur+1,length,max);
        }
        else
        {
            if(arr[cur+1] < arr[max])
            {
                int temp = arr[cur+1];
                arr[cur+1] = arr[max];
                arr[max] = temp;
                bubbleSort(arr,0,length-1,0);
            }
            bubbleSort(arr,0,length-1,0);
        }
        
    }
}
