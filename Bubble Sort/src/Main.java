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

        System.out.print("Before Bubble Sort: ");
        System.out.println();
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr,n);
        System.out.println("After Bubble Sort: ");
        for(int i = 0 ; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr , int n)
    {
        for(int i = n-1; i>=0; i--)
        {
            int didSwap = 0;
            for(int j = 0 ; j<= i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    didSwap = 1;
                }
            }

            if(didSwap == 0)
            {
                break;
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
        Enter the Array Size:5
        Enter the elements:3
        4
        6453
        34
        1
        Before Bubble Sort:
        3 4 6453 34 1
        After Bubble Sort:
        1 3 4 34 6453
 */