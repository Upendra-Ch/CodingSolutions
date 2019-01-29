/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException  {
		//code
		BufferedReader br = new BufferedReader (new BufferedReader(new InputStreamReader (System.in)));
		int numTestCases= Integer.parseInt(br.readLine().trim());
		while(numTestCases-->0){
		    String[] t_n = br.readLine().split(" ");
		    int numEle = Integer.parseInt(t_n[0]);
		    int n= Integer.parseInt(t_n[1]);
		    String [] inputStrArr = br.readLine().split("\\s+");
		    int []inputArr = new int[numEle];
		    for(int i=0;i<numEle;i++)
		        inputArr [i] = Integer.parseInt(inputStrArr[i]);
		    int ind  =findMaxInd(inputArr,n,0);
		    int lead = inputArr [ind];
		    System.out.print(lead);
		    int leadind =ind;
		    ind =ind-1;
		    for(int i=n;i<numEle;i++,ind--)
		    {
		        if(ind==-1){
		            ind =findMaxInd(inputArr ,n,i-n+1);
		            lead = inputArr[i-(n-ind-1)];
		            leadind =ind;
		            //System.out.print(" "+inputArr[ind]);
		        }
		        else{
		            if(lead >=inputArr[i]){
		            }
		            else{
		                lead = inputArr[i];
		                ind =n-1;
		                leadind=i;
		            }
		        }
		        System.out.print(" "+lead);
		    }System.out.println();
		}
	}
	
	static int findMaxInd (int []input, int n,int start){
	   // int max = (inputArr [0] >inputArr [1] ) ? ((inputArr [0] > inputArr [2])?inputArr [0] :inputArr [2]) : ((inputArr [1] > inputArr [2])?inputArr [1] :inputArr [2]);
	    //if( max = inputArr [0])
	    int max = input[0+start];
	    int ind =0;
	    for(int i=1;i<n;i++)
	    {	  
	        if(input[i+start]>=max)
	        {
	            max = input[i+start];
	            ind = i;
	        }
	    }
	    return ind;
	}
}
