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
		    String inp [] = br.readLine().split(" ");
		    int len=0;
		    int flag=0;
		    StringBuilder sb = new StringBuilder("");
		    for(int j=0;j<inp[0].length();j++)
		    {
		        //System.out.println("debug");
		        char temp = inp[0].charAt(j);
		        for(int i=0;i<n;i++){
		            if(inp[i].length()==j)
		                {//System.out.println("debug1");
		                    len = j;
		                    flag = 1;
		                    break;
		                }
		            if(inp[i].charAt(j)==temp){
		                //System.out.println("debug2");
		                if(i==n-1){
		                    sb.append(temp);
		                }
		            }else {
		                //System.out.println(inp[i].charAt(j)+temp);
		                    flag=1;
		                    break;
		                }
		        }
		        if(flag==1)
		            break;
		    }
		    if(sb.toString().length()==0)
		        System.out.println("-1");
		        else
		            System.out.println(sb);
		}
	}
}
