/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int testCases = Integer.parseInt(br.readLine());
	    while(testCases-->0)
	    {
        int num = Integer.parseInt(br.readLine());
	      for(int i=27;i>0;i--)
        {
          if((num & (1<<i))>0)
          {
            System.out.println(1<<i);
	          break;
	        }
	       }
	     }
	}
}
