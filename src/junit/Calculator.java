package junit;

public class Calculator 
{
	int add(int x, int y)
	{
	return x+y;
	}
	int sub(int x, int y)
	{
	return x-y;
	}
	int mul(int x, int y)
	{
	return x*y;
	}
	public static int findLarge(int arr[]){  

        int lar=0;  

        for(int i=1;i<arr.length;i++){  

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 
}
