public class lab5Linear
{    
	public static int linearSearch(int[] arr, int uk)
	{ 
		int x=arr.length;   
        for(int i=0;i<x;i++)
        {    
            if(arr[i] == uk){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr1= {6,2,1,5,20,7,4,3,9};    
        int value = 20;    
        System.out.println(value+" is found at index: "+linearSearch(arr1, value));    
    }    
}    