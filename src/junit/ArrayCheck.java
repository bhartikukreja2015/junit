package junit;

import java.util.Arrays;

public class ArrayCheck 
{
	static int arr[];
	public static int[] rotate(int[] arr)
	{
		int item=arr[arr.length-1];
		for (int i =arr.length-1; i >0; i--) 
        {
            arr[i]=arr[i-1]; 
        }
		arr[0]=item;
		return arr;
		
	}
	public static float median(int[] arr)
	{
		float first=0;
		float second=0;
		Arrays.sort(arr);
		if(arr.length%2==0)
		{
			first=arr[(arr.length/2)-1];
			second=arr[(arr.length/2)];
			return (first+second)/2;
		}
		else
		{
		
			return (float) arr[((arr.length+1)/2)-1];
		}
		
	}
	
	    public static void main(String[] args) 
	    {
	       
	    	arr=new int[args.length];
	        for (int i = 0; i < args.length; i++) 
	        {
	            arr[i] = Integer.parseInt(args[i]);
	        }
	       
	        for (int i = 0; i < args.length; i++) 
	        {
	            System.out.println(arr[i]);
	        }
	       arr=rotate(arr);
	       
	       for (int i = 0; i < args.length; i++) 
	        {
	            System.out.println(arr[i]);
	        }
	      float media=median(arr);
	       System.out.println("the median is "+media);
	    }


}
