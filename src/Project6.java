/**
 * 
 * @author Amit
 *This class implements the knapsack 0-1 problem with a dynamic programming approach.
 *
 */
public class Project6 {
	/**
	 * 
	 * @param n - number of items
	 * @param weight - array of weights
	 * @param value-   array of value
	 * @param W -  capacity of knapsack
	 * @return
	 */
	public static int knapSack(int n, int weight[], int value[], int W)
	{
	   int total[][] = new int[n+1][W+1];
	 
	   for (int i = 0; i <= n; i++)
	   {
	       for (int j = 0; j <= W; j++)
	       {
	           if (i==0 || j==0)
	               total[i][j] = 0;
	           else if (weight[i-1] <= j){
	                 total[i][j] = max(value[i-1] + total[i-1][j-weight[i-1]],  total[i-1][j]);
	                 System.out.println(i+","+j);
	           }
	           else{
	                 total[i][j] = total[i-1][j];
	                 
	           }
	       }
	   }
       boolean[] take = new boolean[N+1];
       for (int n1 = n, w = W; n1 > 0; n1--) {
           if (total[n1][w]) { take[n1] = true;  w = w - weight[n1]; }
           else           { take[n1] = false;                    }
       }
	 
	   return total[n][W];
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int max(int a, int b) {
		if(a>b)
			return a;
			else
				return b;
		}
	/**
	 * Test function
	 *
	 */
	public static void main(String args[]){
		int val[] = {4,7, 10, 25};
	    int wt[] = {10, 20, 30,80};
	    int  W = 100;
	    int n = val.length;
	    System.out.println( knapSack(n, wt, val, W));
	  
	}
}
