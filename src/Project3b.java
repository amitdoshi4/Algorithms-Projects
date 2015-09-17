/* This class implements a function hasSum that is O(n log(n)) that does the same thing when S is an arbitrary array of
numbers
 * 
 * *
 * Version 1.0
 * 
 * @author Amit Doshi
 *
 * Date: 03/15/2015
 * 
 */
public class Project3b {
	 private static int[] numbers;
	  private static int[] helper;
	  
/*
 * @param a[] int
 * @param x   int
	   */
	  public static boolean HasSum(int a[],int x){
		  sort(a);
			int j =a.length-1;
			int i =0;
			while(i<j){
				
				if(a[i]+a[j]== x)
					return true;
				if(a[i]+a[j]<x)
					i++;
				else
					j--;
			}
			return false;
		}
/*
 * @param values[] int
 */
	public static void sort(int[] values) {
	    numbers = values;
	    helper = new int[values.length];
	    mergesort(0, values.length - 1);
	  }
/*
 * @param low int
 * @param high int
 */
	  private static void mergesort(int low, int high) {
	    if (low < high) {
	      
	      int middle = low + (high - low) / 2;
	      
	      mergesort(low, middle);
	      
	      mergesort(middle + 1, high);
	      
	      merge(low, middle, high);
	    }
	  }
/*
* @param low int
* @param high int
* @param middle int
*/

	  private static void merge(int low, int middle, int high) {

	    
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
	  //Test Function
	  public static void main(String args[]){
		  int values[] = {10,3,5,2,1,6,9,7,8,4};
		 System.out.println(HasSum(values, 21));
	  }
	} 



