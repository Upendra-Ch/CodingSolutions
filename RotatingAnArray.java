/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String noTestString = br.readLine();
		int noTest = Integer.parseInt(noTestString);
		while(noTest-->0){
		    int noEle = Integer.parseInt(br.readLine());
		    int [] numArr = new int[noEle];
		    String s = br.readLine();
		    String [] sArr = s.split(" ");
		    for(int i=0;i<noEle;i++)
		        numArr[i] = Integer.parseInt(sArr[i]);
		    int d = Integer.parseInt(br.readLine());
		    numArr = rotate(numArr,d);
		    for(int i=0;i<numArr.length;i++)
	            System.out.print(numArr[i]+" ");
	        System.out.println();   
		}
	}
	static int [] rotate(int [] numArr, int d){
	    int [] temp = new int [d];
	    int arrLen = numArr.length;
	    for(int i=0;i<d;i++)
	        temp [i]= numArr[i];
	    for(int i=0;i<arrLen-d;i++)
	        numArr[i]=numArr[i+d];
	    for(int i=0;i<d;i++)
	        numArr [arrLen-d+i]= temp[i];   
	    return numArr;
	}
}
