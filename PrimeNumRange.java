/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
//import java.math;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		    String [] inputStrArr =  br.readLine().split(" ");
		    int low = Integer.parseInt(inputStrArr[0]),n= Integer.parseInt(inputStrArr[1]);
		    int [] primArr = new int[n+1];
		    primArr[1]=1;
		    double nsqrt = java.lang.Math.ceil(java.lang.Math.sqrt(n));
		    //System.out.println("nsqrt"+nsqrt);
		    for(int i=2;i<=nsqrt;i++){
		        for(int j=2;j<=n;j++){
		            if(i*j<=n)
		            primArr[i*j]=1;
		        }
		    }
		    for(int i=low;i<=n;i++)
		        System.out.print((primArr[i]==0)? i+" " :"");
		  System.out.println();
		}
		
	}
}
