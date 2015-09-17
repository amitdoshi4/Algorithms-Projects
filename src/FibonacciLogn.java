
public class FibonacciLogn {
	
	public static int getNthfibo(int n) {

        if (n <= 1) return n;

        int[][] result = {{1, 0}, {0, 1}}; // identity matrix.
        int[][] fiboM = {{1, 1}, {1, 0}};
        
        power(result,fiboM,n);


        return result[1][0];
    }
	public static void power(int result[][],int fiboM[][], int n){
		 while (n > 0) {
	            if (n%2 == 1) {
	                multMatrix(result, fiboM);
	            }
	            n = n / 2;
	            multMatrix(fiboM, fiboM);
	        }
		
	}

    private static void multMatrix(int[][] m, int [][] n) {
        int a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        int b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        int c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        int d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }

public static void main(String args[]){
	System.out.println(getNthfibo(8));
}

}
