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

        System.out.print("Before Merge Sort: ");
        System.out.println();
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(arr,0,n-1);
        System.out.println("After Merge Sort: ");
        for(int i = 0 ; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = (low + high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr , int low , int mid , int high)
    {
        int left = low;
        int right = mid+1;
        int[] temp = new int[arr.length];
        int arrayIndex = 0;

        while (left<=mid && right <=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[arrayIndex] = arr[left];
                arrayIndex++;
                left++;
            }
            else
            {
                temp[arrayIndex] = arr[right];
                arrayIndex++;
                right++;
            }
        }

        while(left<=mid)
        {
            temp[arrayIndex] = arr[left];
            arrayIndex++;
            left++;
        }

        while(right<=high)
        {
            temp[arrayIndex] = arr[right];
            arrayIndex++;
            right++;
        }

        for(int i = low ; i<=high ; i++)
        {
            arr[i] = temp[i - low];
        }
    }
}

/*
        Enter the Array Size:7
        Enter the elements:9
        4
        7
        6
        3
        1
        5
        Before Merge Sort:
        9 4 7 6 3 1 5
        After Merge Sort:
        1 3 4 5 6 7 9
 */