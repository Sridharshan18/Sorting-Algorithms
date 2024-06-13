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

        System.out.print("Before Selection Sort: ");
        System.out.println();
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr,n);
        System.out.println("After Selection Sort: ");
        for(int i = 0 ; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int[] arr, int n)
    {
        for(int i = 0 ; i<n-1;i++)
        {
            int min = i;
            for(int j = i; j<n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }

                swap(arr,i,min);
            }
        }
    }

    public static void swap(int[] arr , int i , int min)
    {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}

/*
   Output:
        Enter the Array Size:5
        Enter the elements:34
        23
        12
        89
        678
        Before Selection Sort:
        34 23 12 89 678
        After Selection Sort:
        12 23 34 89 678
 */