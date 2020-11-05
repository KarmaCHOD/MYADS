class MergeSort 
{ 
  
    void merge(int a[], int lo, int mid, int hi) 
    { 
 
        int fst = mid - lo + 1; 
        int cnd = hi - mid; 
  
        /* Create temp arrays */
        int L[] = new int [fst]; 
        int R[] = new int [cnd]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<fst; ++i) 
            L[i] = a[lo + i]; 
        for (int j=0; j<cnd; ++j) 
            R[j] = a[mid + 1+ j]; 
  
  
        
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = lo; 
        while (i < fst && j < cnd) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        //Copy remaining elements of L[] if any 
        while (i < fst) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Copy remaining elements of R[] if any 
        while (j < cnd) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    
    void sort(int a[], int lo, int hi) 
    { 
        if (lo < hi) 
        { 
            // Find the middle point 
            int mid = (lo+hi)/2; 
  
            // Sort first and second halves 
            sort(a, lo, mid); 
            sort(a , mid+1, hi); 
  
            // Merge the sorted halves 
            merge(a, lo, mid, hi); 
        } 
    } 
  
      static void printArray(int a[]) 
    { 
        int n = a.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
    } 
  
    
    public static void main(String args[]) 
    { 
        int a[] = {10,1,5,2,9,7,4,6,8,3,11}; 
  
        System.out.println("Usorted Array is :"); 
        printArray(a); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(a, 0, a.length-1); 
  
        System.out.println("\nSorted array is :"); 
        printArray(a); 
    } 
}