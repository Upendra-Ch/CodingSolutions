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
		    int n= Integer.parseInt(br.readLine());
		    System.out.println(((n&0x0F)<<4)|((n&0xF0)>>4));
		}
	}
}
