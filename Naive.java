import java.util.*;
import java.lang.*;

public class Naive 
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
		int largest = getLargest(arr,n);

		//initialize the result as -1 cauz there may be an array where all elements 
		//equal, in that case there is no 2nd largest
		int res = -1;

		for(int i=0; i<n; i++)
		{
			//consider only those elements which are != largest
			if(arr[i] != arr[largest])
			{
				//if res=-1 then this is the first element which is not equal to largest 
				//and we marke it as the result
				if(res == -1)
					res=i;

				//when result is not -1, i.e. it is set to some value
				//compare with arr[result], and if greater, update result
				else if(arr[i]>arr[res])
					res=i;
			}
		}
		return res; 
	}

	public static int getLargest(int arr[], int n)
	{
		int largest=0;
		for(int k=1; k<n; k++)
		{
			if(arr[k] > arr[largest])
			{
				largest = k;
			}
		}

		return largest;
	} 
}

