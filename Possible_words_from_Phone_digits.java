/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static LinkedList<String> result;
	public static void main (String[] args)throws IOException {
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		     result= new LinkedList<>();
		    int num =  Integer.parseInt(br.readLine());
		    String [] inpStrArr = br.readLine().split(" ");
		    int []inpIntArr = new int [num];
		    for(int i=0;i<num;i++)
		        inpIntArr[i]= Integer.parseInt(inpStrArr[i]);
		    String [] util = {"abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		    print(util,inpIntArr,1,"");
		    for(String temp :result)
		    System.out.print(temp+" ");
		    System.out.println();
		}
	}
	public static void print(String [] util, int []inpIntArr,int len,String ret){
	    if(len==inpIntArr.length+1){
	        result.add(ret);
	        return;
	    }
	    int curNum =inpIntArr[len-1];
	    String cur = util[curNum-2];
        for(int i=0;i<cur.length();i++){
            String resltant = ret+cur.charAt(i);
            print(util,inpIntArr,len+1,resltant);
        }
	}
}
