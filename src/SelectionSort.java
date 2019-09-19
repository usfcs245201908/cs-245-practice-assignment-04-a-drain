public class SelectionSort implements SortingAlgorithm{

    public void sort(int[] a){
        int n = a.length;
        // Move boundary of unsorted subarray
        for(int i=0; i <n-1; i++){
            int min_index = i;
            // Find min element of unsorted array
            for(int j=i+1; j < n; j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
    }
}
