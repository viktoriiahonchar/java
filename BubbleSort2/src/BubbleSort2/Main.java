package BubbleSort2;


        //public length(InputStream in) {
        /* Prints the array */
        void printArray(int arr[])
        {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
        }

public class Main {
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        Scanner ob = new Scanner(System.in);
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}