package DSAalgorithm;
import java.util.*;

class Sort1
{
    public static void insertion_sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}

public class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Sort1.insertion_sort(arr);

        System.out.println("Sorted Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
