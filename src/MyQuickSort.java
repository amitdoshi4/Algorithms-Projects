public class MyQuickSort {

	/* This class implements the tail recursive quick sort algorithm 
	 * 
	 * *
	 * Version 1.0
	 * 
	 * @author Amit Doshi
	 *
	 * Date: 03/15/2015
	 * 
	 */
    public static void main(String[] args) {

        int a[]={23,44,1,2009,2,88,123,7,999,1040,88};
        quickSort(a, 0, a.length - 1);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }

    public static void quickSort(int[] a, int p, int r)
    {
        while(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q-1);
            p=q+1;
        }
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[r];
        int i = p-1 ;

        for(int j=p;j<=r-1;j++) {
            	 if (a[j]<=x){
            		 i=i+1;
                  swap(a, i, j);
            	 }
        }
        swap(a,i+1,r);
        return i+1;
        		
    }

    private static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}