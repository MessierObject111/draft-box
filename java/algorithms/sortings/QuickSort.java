package sorting.quickSort;

public class QuickSort {
	private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
	public void quickSort(int lowerIndex, int higherIndex) {

       int i = lowerIndex;
       int j = higherIndex;
       // calculate pivot number, I am taking pivot as middle index number
       int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
       System.out.println("pivot:" + pivot+" index:"+(lowerIndex+(higherIndex-lowerIndex)/2));

       //Just for console demonstration purpose
       if(i > j) {
    	   System.out.println("i <= j, Range already sorted: i:"+i+" j:"+j);
       }
       // Divide into two arrays
       while (i <= j) {
    	   System.out.println("i <= j, doing recursive range: i:"+i+" j:"+j);
           /**
            * In each iteration, we will identify a number from left side which
            * is greater then the pivot value, and also we will identify a number
            * from right side which is less then the pivot value. Once the search
            * is done, then we exchange both numbers.
            */
           while (array[i] < pivot) {
        	   System.out.println("i++");
               i++;
           }
           while (array[j] > pivot) {
        	   System.out.println("j--");
               j--;
           }
           if (i < j) {
        	   System.out.println("exchange "+ i+ " and "+j);
               exchangeNumbers(i, j);
               //move index to next position on both sides
               System.out.println("i++/j--");
               i++;
               j--;
           }
           if(i == j){
        	   System.out.println("i++/j--");
        	   i++;
               j--;
           }
       }


     /* If there are numbers between left boundary and j, do a recurse call.
      * Else, it means j reached left boundary and it doesn't need further sorting.
      * The same applies to the right side boundary.
      * */
       if (lowerIndex < j) {
    	// call quickSort() method recursively
    	   System.out.println("Recurse in left side sub section:"+lowerIndex + " - "+ j);
           quickSort(lowerIndex, j);
       }else{
    	   System.out.println("lowerIndex >= j, Range already sorted: j:"+j+" i:"+i);
       }
       if (i < higherIndex){
    	   System.out.println("Recurse in right side sub section:"+ i + " - "+ higherIndex);
    	   quickSort(i, higherIndex);
       }else{
    	   System.out.println("i >= higherIndex, Range already sorted: i:"+i+" j:"+j);
       }
   }

   private void exchangeNumbers(int i, int j) {
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
   }
   
}
