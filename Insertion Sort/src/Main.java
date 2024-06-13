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

        System.out.print("Before Insertion Sort: ");
        System.out.println();
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr,n);
        System.out.println("After Insertion Sort: ");
        for(int i = 0 ; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int[] arr , int n)
    {
        for(int i = 0 ; i<n; i++)
        {
            int j = i;

            while(j>0 && arr[j-1]>arr[j])
            {
                swap(arr,j-1,j);
                j--;
            }
        }
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
            Enter the Array Size:6
            Enter the elements:34
            21
            78
            65
            34
            123
            Before Insertion Sort:
            34 21 78 65 34 123
            After Insertion Sort:
            21 34 34 65 78 123
 */