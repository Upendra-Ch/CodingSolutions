/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		    long num = Integer.parseInt(br.readLine());
		    long rev=0;
		    for(int i=0;i<32;i++){
		        rev = rev<<1;
		        long tmp = (num & (1<<i));
		        if(tmp!=0)
		        {
		            rev++;
		        }
		    }
		    System.out.println(rev);
		}
	}
}
