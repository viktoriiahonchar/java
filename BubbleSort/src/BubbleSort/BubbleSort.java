package BubbleSort;

//class TestClass {
   // public static void main(String args[] ) {
      // int n;
      // n= args.length;
      // int A;
//    }
    class BubbleSort {
        void bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }


        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }


        public static void main(String args[])
        {
            BubbleSort ob = new BubbleSort();
            int arr[] = { 1, 3, 4, 2, 5 };
            ob.bubbleSort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }