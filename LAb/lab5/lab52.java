public class lab52
{
	public static void lSD_sort(String []a, int size)
	{
		int N=a.length;
		int R=256;
		String[] aux=new String[N];
		for (int j=size-1;j>=0; j-- ) 
		{
			int count []=new int[R+1];
			for (int i = 0; i < N; i++)
			{
				count[a[i].charAt(j) + 1]++;
			}
			for (int r=0; r<R;r++) 
			{
				count[r+1]+=count[r];	
			}
			for (int i=0; i<N;i++ ) 
			{
				aux[count[a[i].charAt(j)]++]=a[i];	
			}
			for (int i=0;i<N;i++ ) 
			{
				a[i]=aux[i];
			
			}
		
		}
		for (int i=0;i<N;i++ ) 
			{
				System.out.println(a[i]);
			}
			System.out.println(" ");
	}
	public static void main(String[] args) 
	{
		String []a={"sonam","karma","dorji","kinly","tsher","ugyen","kinza"};
		int size=a[0].length();
		lSD_sort(a,size);
		
	}
}
	