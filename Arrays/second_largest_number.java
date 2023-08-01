class secondLargestNumber {
     int print2largest(int arr[], int n) {
          int firstLargestNumber = -1;
          int tempNumber = -1;
          int secondLargestNumber = -1;
          for (int i = 0; i < n; i++) {
               tempNumber = arr[i];
               if (firstLargestNumber < arr[i]) {
                    if (tempNumber > secondLargestNumber && tempNumber < firstLargestNumber) {
                         secondLargestNumber = firstLargestNumber;
                         firstLargestNumber = arr[i];
                         secondLargestNumber = tempNumber;
                    }
                    secondLargestNumber = firstLargestNumber;
                    firstLargestNumber = arr[i];
               }
               if (tempNumber > secondLargestNumber && tempNumber < firstLargestNumber) {
                    secondLargestNumber = tempNumber;
               }

          }
          return secondLargestNumber;
     }
}