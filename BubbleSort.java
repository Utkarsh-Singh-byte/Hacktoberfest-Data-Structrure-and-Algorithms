package DSAalgorithm;
import java.util.*;

class Sort
{
    public void bubble_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            // for(int j=0;j<arr.length-1;j++) // there is unnecessary comparison //

            for(int j=0;j<arr.length-1-i;j++)// remove the unnecessary comparison //
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Sort s1=new Sort();
        s1.bubble_sort(arr);

        System.out.println("Sorted Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}

