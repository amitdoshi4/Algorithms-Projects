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
public class Fib {
/* 
 * @param n long 
 * @param a long
 * @param b long
 *
 * @return long
 */
	public long fib(long n,long a,long b){
		if(n==0)
			return a;
		else if(n==1)
			return b;
		else
			return fib(n-1,b,a+b);
	}
/**
* The main program.
*
* @param    args    command line arguments 
*/	
	public static void main(String args[]){
		System.out.println(new Fib().fib(100,0,1));

	}

}
