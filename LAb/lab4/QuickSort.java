
class QuickSort 
{ 
    int partition(int a[], int lo, int hi) 
    { 
        int fixp = a[hi];  
        int i = (lo-1); 
        // index of smaller element 
        for (int j=lo; j<hi; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot poiint
            if (a[j] <= fixp) 
            { 
                i++; 
  
                // swap a[i] and a[j] 
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        // swap a[i+1] and a[hi] (or pivot point) 
        int temp = a[i+1]; 
        a[i+1] = a[hi]; 
        a[hi] = temp; 
  
        return i+1; 
    } 
  
  
    
      // arr[] --> Array to be sorted, 
      // low  --> Starting index, 
      // high  --> Ending index 
    void sort(int a[], int lo, int hi) 
    { 
        if (lo < hi) 
        { 
            //partition is partitioning index, a[pi] is  
             // now at right place 
            int partition= partition(a, lo, hi); 
  
            // Recursively sort elements before and after partition 
            sort(a, lo, partition-1); 
            sort(a, partition+1, hi); 
        } 
    } 
  
    //rint array of size n 
    static void printArray(int a[]) 
    { 
        int n = a.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i]+" "); 
        System.out.println(); 
    } 
  

    public static void main(String args[]) 
    { 
        int a[] = {3,6,4,2,11,10, 7, 8, 9, 1, 5}; 

        System.out.print("Usorted Array is :" ); 
        printArray(a); 
        System.out.println();

        int n = a.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(a, 0, n-1); 
  
        System.out.print("sorted array is :"); 
        printArray(a);
        System.out.println(); 
    } 
} 