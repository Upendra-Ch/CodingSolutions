/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		    int n =  Integer.parseInt(br.readLine());
		    String [] inpStrArr = br.readLine().split(" ");
		    int k = Integer.parseInt(br.readLine());
		    int [] inpIntArr = new int[n];
		    inpIntArr[0]= Integer.parseInt(inpStrArr[0]);
		    int r=-1;
		    for(int i=1;i<n;i++){
		        inpIntArr[i]= Integer.parseInt(inpStrArr[i]);
		        if(inpIntArr[i]<inpIntArr[i-1])
		            r=i;
		    }
		    //System.out.println("r="+r);
		    System.out.println(bin_search(inpIntArr,r,n+r,k,n));
		}
	}
	public static int bin_search(int A[], int left, int right,  int k,int n)
	{
		// Your code here
		/*int temp =Arrays.binarySearch(A,k);
		return temp > 0 ? temp:-1 ;*/
		int mid = (left+right)/2;
		//System.out.println("left= "+left+"\tright="+right+"\tmid= "+mid);
		if(right<left)
		    return -1;
		int A_right = right%n;
		int A_left = left%n;
		int A_mid =mid%n;
		if(A[A_mid]==k)
		    return A_mid;
		if(A[A_mid]>k)
		     return bin_search(A,left,mid-1,k,n);
		else return bin_search(A,mid+1,right,k,n);
		    
	}
}
