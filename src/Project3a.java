
/**
 * The class is for implementing a sortedHasSum that takes a sorted array S of n numbers and another number x, and
returns a Boolean indicating whether or not there is a pair of numbers in S whose sum is x that is O(n).

 *
 * Version 1.0
 * 
 * @author Amit Doshi
 *
 * Date: 03/15/2015
 * 
 */
public class Project3a {

//Test	
public static void main(String args[]){
	int arr[] = new int[5];
	int x = 8;
	
	arr[0] = 2;
	arr[1] = 3;
	arr[2] = 5;
	arr[3] = 6;
	arr[4] = 7;
	System.out.println(sortedHasSum(arr,x));
}
/*
 * @param a[] int
 * @param x   int
 */
public static boolean sortedHasSum(int a[],int x){
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
}
