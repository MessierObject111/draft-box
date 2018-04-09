package sorting.mergeSort;

public class MergeSort {
  public void mergeSort(int[] arr){
    if(arr == null || arr.length <= 1){
      return;
    }
    divide(arr, 0, arr.length);
  }

  public void divide(int[] arr, int left, int right){
    while(left > right){
      int middle = left + (left + right)/2;
      divide(arr, left, middle);
      divide(arr, middle + 1, right);
      mergeParts(arr, left, middle, right);
    }
  }

  private void mergeParts(int[] arr, int left, int middle, int right ) {
    int i = 0; int j = 0; int k = 0;
    //When left array hasn't reached the end:
    while(i < left.length || j < right.length){
      if(i < left.length){
        middle[k] = left[i];
        i++;
      }
      if(j < right.length){
        middle[k] = right[j];
        j++;
      }
      k++;
    }
    //When left array reached the end:

  }
/**
* This is for demonstration purpose only.
* This method will merge two sorted lists into one big sorted list.
*/
  public void mergeTwoSortedLists(int[] left, int[] right, int[] result) {
    int i=0; int j=0; int k = 0;
        while(i < left.length || j < right.length){
        	if(/*Left array haven't reached end*/i < left.length){
        		if(/*Left < right*/left[i] < right[j]){
              	  System.out.println(k + left[i]+" i：" +i);
              	  result[k] = left[i];
                  i++;
                }else{/*Left >= right*/
              	System.out.println(k + ": j" + right[j]);
              	result[k] = right[j];
                  j++;
                }
                k++;
        	}
        	else/*Left array reached end*/{
        		while(j < right.length){
        			result[k] = right[j];
        			j++;
        			k++;
        		}
        	}
        }
    }
}
