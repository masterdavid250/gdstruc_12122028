public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 34;
        numbers[1] = 32;
        numbers[2] = 12;
        numbers[3] = 23;
        numbers[4] = 54;
        numbers[5] = 76;
        numbers[6] = 32;
        numbers[7] = 21;
        numbers[8] = 15;
        numbers[9] = 17;

       System.out.println("\n\nBefore sort:" );
       //System.out.println("\n\nAfter bubble sort:" );
       printArrayElements(numbers);

       selectionSort(numbers);
       // bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:" );
        //System.out.println("\n\nAfter bubble sort:" );
        printArrayElements(numbers);
    }

    //DESCENDING BUBBLE SORT
    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    //DESCENDING SELECTION SORT
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }


    private static void printArrayElements(int [] arr)
    {
        for (int j: arr)
        {
            System.out.print(j + " ");
        }
    }
}
