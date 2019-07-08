/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    //publis static boolean ret=false;
    public static char[] a;
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		     a= br.readLine().toCharArray();
		     //int count =4;
		     while(true ){
		         //System.out.println(a.toString());
		         if(!rec(a.length))
		            break;
		     }
		    
		    
		    //
		}
	}
	public static boolean rec(int n){
	    Stack<Character> st = new Stack<>();
	    boolean ret = false;
	    for(int i=0;i<n;i++){
	        if(st.size()==0){
	            st.push(a[i]);
	        }else if(st.peek()==a[i]){
	            //System.out.print(i+" ");
	            i=check(a,i+1,st.pop(),st);
	           ret = true;
	            //System.out.print(i+"\t");
	        }else {
	            //System.out.print(a[i]);
	            st.push(a[i]);
	            
	        }
	    }
	    StringBuilder sb = new StringBuilder("");
	    while(st.size()!=0){
	        sb.append(st.pop());
	    }
	    //System.out.println(sb.reverse());
	    
	    a =sb.reverse().toString().toCharArray();
	    if(!ret)
	    System.out.println(new String(a));
	    return ret;
	}
	public static int check(char [] a,int i, Character c,Stack<Character> st ){
	    for(;i<a.length;i++){
	        if(c!=a[i]){
	            st.push(a[i]);
	            return i;
	        }
	    }
	    return a.length;
	}
}
