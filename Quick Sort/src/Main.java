import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i =0 ; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Before Quick Sort: ");
        System.out.println();
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("After Quick Sort: ");
        for(int i = 0 ; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr, int low , int  high)
    {
        int n = arr.length;
        if(low<high)
        {
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static int  partition(int[] arr, int low , int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }

            while(arr[j]>pivot && j>=low+1)
            {
                j--;
            }

            if(i<j)
            {
                swap(arr,i,j);
            }
        }

        swap(arr,low,j);
        return j;
    }

    public static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

  Output:

     Enter the Array Size:4
     Enter the elements:4
     3
     2
     1
     Before Quick Sort:
     4 3 2 1
     After Quick Sort:
     1 2 3 4

 */