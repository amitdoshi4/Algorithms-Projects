/**
 * The class is for calculating Fibonacci
 *
 * Version 1.0
 * 
 * @author Amit Doshi
 *
 * Date: 02/18/2015
 * 
 */
public class Fibonacci {
	
	 /* 
     * @param n long
     * 
     * @return long
     */
	public long fib(long n){
		if(n == 0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	/**
	* The main program.
	*
	* @param    args    command line arguments 
	*/
	public static void main(String args[]){
   
		System.out.println(new Fibonacci().fib(6));
	}

}
