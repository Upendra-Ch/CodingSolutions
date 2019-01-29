/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine().trim());
		while(numTestCases-->0){
		    int numEle = Integer.parseInt(br.readLine().trim());
		    String [] inputStrArr =  br.readLine().split(" ");
		    int [] inputArr = new int[numEle];
		    
		    for(int i =0 ;i<numEle;i++)
		        inputArr[i]=  Integer.parseInt(inputStrArr[i]);
		    int cur = inputArr[numEle-1];
		    //StringBuilder str = new StringBuilder(cur+"");
		    //System.out.print(cur);
		    int j= numEle -2;
		    for(int i = numEle-2;i>=0;i--)
		        if(inputArr[i]>=cur){
		           inputArr[j--]= inputArr[i];
		            cur = inputArr[i];
		            
		        }
		    for(int i=j+1;i<numEle;i++)
		      System.out.print(inputArr[i]+" ");
		    System.out.println();
		}
	}
}
