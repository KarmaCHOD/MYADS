public class selection{

    public static void selectionsort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int lowest_index=i;
            for(int k=i+1; k<arr.length;k++ ) {
                if (arr[lowest_index] > arr[k]) {
                    lowest_index=k;
                }
                
            }
            int tem=arr[lowest_index];
            arr[lowest_index]=arr[i];
            arr[i]=tem; 
        }  
    }
    public static void main(String[] args) {
        int [] a={7,3,4,8,1,6,2,5};
        System.out.println("Unsorted array list.");
        for(int i : a){
            
            System.out.print(i+" ");
        }
        selectionsort(a);
         System.out.println("sorted array list.");
         //System.out.println();
         for (int i = 0;i < a.length ;i++ ) {
             System.out.print(a[i]);
         }
        
         System.out.println();
        
        
    }
}