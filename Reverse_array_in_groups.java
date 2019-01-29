/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int numTestCases = Integer.parseInt(br.readLine());
	
		while(numTestCases-->0){
		    	String [] n_k = br.readLine().split(" ");
		        int n = Integer.parseInt(n_k[0]);
		        int k= Integer.parseInt(n_k[1]);
		        int []inputArr = new int[n];
		        String []inputStrArr = br.readLine().split(" ");
	    	    for(int i=0;i<n;i++)
		             inputArr[i]=Integer.parseInt(inputStrArr[i]);
		       // int count = 0;
		        for(int i=0;i<k/2;i++){
		          for(int j=0;j<n/k;j++)
		            {
		             //System.out.println("count :"+(++count));
		                int temp =inputArr[j*k+i];
		                inputArr[j*k+i]=inputArr[j*k+k-i-1];
		                inputArr[j*k+k-i-1]= temp;
		            }
		     }
		     
		    int mod = n%k;
		    //System.out.println("\nmod ="+mod);
		    for(int i= n-mod,j=0;i<((n-mod)+mod/2);i++,j++){
		        int temp =inputArr[i];
		            inputArr[i]=inputArr[n-j-1];
		            inputArr[n-j-1]= temp;
		    }
		    StringBuilder str =  new StringBuilder("");
		    for(int i=0;i<n;i++)
		    str.append(inputArr[i]+" ");
		    System.out.println(str);
		}
		
	}
}
