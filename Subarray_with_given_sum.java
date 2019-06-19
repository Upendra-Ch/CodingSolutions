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
		    //int num =  Integer.parseInt(br.readLine());
		    String [] ns = br.readLine().split(" ");
		    int n= Integer.parseInt(ns[0]);
		    int s= Integer.parseInt(ns[1]);
		    String inpStrArr [ ] = br.readLine().split(" ");
		    int inpIntArr [] =  new int[n];
		    int sum=0;
		    int beg =0,end =0;
		    for(int i=0;i<n;i++)
		    {
		        inpIntArr[i] = Integer.parseInt(inpStrArr[i]);
		        if(sum+inpIntArr[i] == s){
		            end = i;
		            break;
		        }else if(sum+inpIntArr[i] >s)
		            {
		                sum =sum-inpIntArr[beg]+inpIntArr[i];
		                beg = beg+1;
		                if(sum==s){
		                    end = i;
		                    break;
		                }else
		                {
		                    if(sum >s)
		                    {
		                        sum =sum-inpIntArr[i];
        		                i--;
		                        continue;
        		            }
		                }
		            }else  sum=sum+inpIntArr[i];
		    }if(end==0)
		        System.out.println("-1");
		    else System.out.println((beg+1)+" "+(end+1));
	    }
	}
}
