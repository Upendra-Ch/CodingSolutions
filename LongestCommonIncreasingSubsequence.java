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
		    //String []n1n2 = br.readLine().split(" ");
		    int n1= Integer.parseInt(br.readLine().trim());
		        String []s1 = br.readLine().split(" ");
		    int a1 [] = new int [n1]; 
		    int n2= Integer.parseInt(br.readLine().trim());
    		    String s2[] = br.readLine().split(" ");
    		int a2 [] = new int [n2]; 
    		for(int i=0;i<n1;i++)
    		    a1[i]= Integer.parseInt(s1[i]);
    		for(int i=0;i<n2;i++)
    		    a2[i]= Integer.parseInt(s2[i]);
		    //int tab [][] = new int[n1+1][n2+1];
		    int table [] = new int[n2];
	        for(int i=0;i<n1;i++)
	            {
	                int temp =0;
	                for(int j=0;j<n2;j++){
	                    if(a1[i]==a2[j])
	                        if(temp+1>table[j])
	                             table[j] =temp+1;
	                    if(a1[i]>a2[j]) 
	                        if(table[j]>temp)
	                            temp = table[j];
	                }
	            }
	            int max=0;
	            for(int j=0;j<n2;j++)
	                if(max<table[j])
	                    max=table[j];
	                    System.out.println(max);
		}
	}
}
