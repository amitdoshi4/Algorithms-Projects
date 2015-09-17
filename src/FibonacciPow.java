/**
 * The class is for calculating L(a,b)
 *
 * Version 1.0
 * 
 * @author Amit Doshi
 *
 * Date: 03/06/2015
 * 
 */
public class FibonacciPow {
	/*
   * (a) Representation of l 
	 * - L(a, b) = (b, a + b)
	 * 
	 * This can be further expanded for l^n like:
	 * l^2 = (a+b,a+2b)
	 * l^3 = (a+2b,2a+3b)
	 * l^4 = (2a+3b,3a+5b)
	 */
	/* 
     * @param a long
     * @param b long
     * @return void
     */
	public static void representationL(int a, int b){
		System.out.println("l = " + b);
	}
/* (b) Algorithm to generate power
 * 
 * Power algorithm 
   This algorithm is based on calculating power(M, n )), and relies on the fact that
   if we multiply a matrix n times by itself we get the nth power of that number.
    |1  1|n = |Fn+1 Fn  |
    |1  0|    |Fn   Fn-1|    
    In this for each value of n we multiply the matrix to itself and then reduce the value of n by half
 */
/*
 * @param n long
 * @param a long
 * @param b long
 * 
 * @return long
 */
	public static long powerOfL(long n,long a,long b){
	       if (n <= 1) 
	    	   return n;

	        long[][] result = {{a, b}, {b, a}}; // Matrix representing the a and b value
	        long[][] fibMatrix = {{1, 1}, {1, 0}};
		 while (n > 0) {
	            if (n%2 == 1) {
	            	multiplyMatrix(result, fibMatrix);
	            }
	            n = n / 2;
	            multiplyMatrix(fibMatrix, fibMatrix);
	        }
		 return result[1][1];
		
	}
	/*
	 * @param m long[][]
	 * @param n long[][]
	 * 
	 * @return long
	 */
    public static void multiplyMatrix(long[][] m, long [][] n) {
        long a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        long b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        long c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        long d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }
    /*
     * @param n long
     * 
     * @return long
     */
  public static long FibPow(int n){
	 return powerOfL(n,0,1);
  }
  /* main
   * 
   */
public static void main(String args[]){
	System.out.println(FibPow(8));
}

}
