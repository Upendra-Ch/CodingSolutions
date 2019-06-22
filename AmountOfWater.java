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
		    int [] inpIntArr = new int[n];
		    for(int i=0;i<n;i++){
		        inpIntArr[i]= Integer.parseInt(inpStrArr[i]);
		    }
		    int curPeak = inpIntArr[0];
		    int totalSum=0;
		    int curSum=0;
		    int peak=0;
		    for(int i=1;i<n;i++){
		        if(curPeak<=inpIntArr[i]){
		            totalSum =totalSum +curSum;
		            curSum=0;
		            curPeak = inpIntArr[i];
		            peak = i;
		        }else {
		            curSum = curSum+curPeak-inpIntArr[i];
		        }
		    }
		    //System.out.println("totalSum="+totalSum+"\t peak = "+peak);
		    curPeak = inpIntArr[n-1];
		    curSum=0;
		    int loop = peak;
		    for(int i=n-1;i>=loop;i--){
		        if(curPeak<=inpIntArr[i]){
		            totalSum =totalSum +curSum;
		            curSum=0;
		            curPeak = inpIntArr[i];
		            peak = i;
		        }else {
		            curSum = curSum+curPeak-inpIntArr[i];
		            //System.out.println("curSum ="+curSum+" peak="+peak);
		        }
		    }
		    System.out.println(totalSum);
		}
	}
}
