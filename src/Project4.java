/* This class implements a function max2 which computes the maximum of two numbers without doing any comparisons.
 * 
 * *
 * Version 1.0
 * 
 * @author Amit Doshi
 *
 * Date: 03/15/2015
 * 
 */
public class Project4 {
	
	/*
	 * @param a int
	 * @param b int
	 * 
	 * @return int
		   */
		 public static int max2(int a, int b) {
		 int c = a - b;
		 int k = (c>>31) & 1;
		 int maxNum = a - (k * c);
		 return maxNum;
		 }
		 
		 
		 //test
		 public static void main (String args[]) {
			System.out.println(max2(7,3));
		}
		}


