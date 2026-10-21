public class quickSort {
    public static void main(String[] args) {
        int arr[]={5,62,2,3,1111,81,4};
        System.out.println("Before Sorting: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After sorting: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low<high){
            int pi=partition( arr, low, high);
            System.out.println();
             for(int num:arr){
            System.out.print(num+" ");
             }
            //Use recursion to break the array into 2 parts, that's why calling quicksort 2 times, as partition divide the array in 2 parts.
            quicksort(arr, low,pi-1 );
            quicksort(arr,pi+1 , high);
            
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pi=arr[high];
        int i=low-1;
       for(int j=low;j<high;j++){
        if(arr[j]<pi){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
       }
       int temp=arr[i+1];
       arr[i+1]=arr[high];
       arr[high]=temp;

       return i+1;
    }
}
