public class lab5{
	public static void main(String[] args) 
	{
		int []a={6,2,1,5,20,7,4,3,9};
		int R=21;
		int [] aux = new int[a.length];
		int[] count = new int[R+1];
		for (int i=0;i<9; i++ ) 
		{

			count[a[i]+1]++;
		}
		for (int r=0;r<R; r++ ) 
		{

			count[r+1]+=count[r];
		}
		for (int i=0;i<9 ;i++ ) 
		{
			aux[count[a[i]]++]=a[i];	
		}
		for (int i=0;i<9 ;i++ ) 
		{
			a[i]=aux[i];
			
		}
		System.out.print("The sorted array of array using key indexing are:");
		
		for (int i=0; i<9; i++) 
		{
			System.out.print(" "+ a[i]);
				
		}
		System.out.println(" ");
		

	}
}