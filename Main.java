import java.util.*;
import java.lang.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the length of the array");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.println("enter the elements of the array");
		for(int j=0; j<n; j++)
		{
			int ele = sc.nextInt();
			arr[j] = ele;
		}

		int second_largest = getSecondLargest(arr, n);
		if(second_largest == -1)
		{
			System.out.println("2nd largest element doesnt exist");
		}
		else
		{
			System.out.println("2nd largest element of the array is:"+arr[second_largest]);
		}
		
	}

	public static int getSecondLargest(int arr[], int n)
	{
		int res=-1; 
		int largest=0;
		for(int i=1; i<n; i++)
		{
			if(arr[i] > arr[largest])
			{
				res = largest;
				largest = i;
			}
			else if(arr[i] != arr[largest])
			{
				if(res == -1 || arr[i] > arr[res])
				{
					res = i;
				}
			}
		}
		return res;
	}
}

