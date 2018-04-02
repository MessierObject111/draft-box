package sorting.quickSort;

public class QuickSort {
  public void sort(int[] arr) {
    if(arr == null || arr.length <= 1){
      return;
    }else{
      quickSort(arr, 0, arr.length-1);
    }
  }

  public void quickSort(int [] arr, int lowerIndex, int higherIndex) {
    int i = lowerIndex;
    int j = higherIndex;
    int pivot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];
    while(i < j){
      while(arr[i] < pivot){
        i++;
      }
      while(arr[j] > pivot){
        j--;
      }
      if(i <= j){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    if(lowerIndex < j){
      quickSort(arr, lowerIndex, j);
    }
    if(higherIndex > i){
      quickSort(arr, i, higherIndex);
    }
  }

  private void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

   public static void main(String a[]){
       QuickSort sorter = new QuickSort();
       int[] input = {7, 3,	6,	1,	2,	9,	0,	5,	8};
       sorter.sort(input);
       for(int i:input){
           System.out.print(i);
           System.out.print(" ");
       }
   }
}
