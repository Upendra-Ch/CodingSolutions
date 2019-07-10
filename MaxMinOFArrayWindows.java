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
		    int [] a = new int[n];
		    for(int i=0;i<n;i++)
		        a[i]= Integer.parseInt(inpStrArr[i]);
		    int []next = new int [n];
		    nextEle(next,a);
		    //System.out.println(Arrays.toString(next));
		    int []prev = new int [n];
		    prevEle(prev,a);
		    //System.out.println(Arrays.toString(prev));
		    int find[] = new int [n+1];
		    for(int i=0;i<n;i++)
		    {
		        int len = next[i]-prev[i]-1;
		        find[len]=Math.max(a[i],find[len]);
		    }
		    for(int i=n-1;i>=0;i--)
		        find[i]=Math.max(find[i],find[i+1]);
		    
		    StringBuilder sb = new StringBuilder("");
		    for(int i=1;i<=n;i++)
		        sb.append(find[i]+" ");
		    System.out.println(sb);
		}
	}
	public static void nextEle(int[] next,int[] a){
	    Stack<Integer> s = new Stack<Integer>();
	    int n= a.length;
	    for(int i=0;i<n;i++){
	        while(!s.isEmpty()&& a[s.peek()]>a[i]){
	            next[s.pop()]=i;
	        }
	        s.push(i);
	    }
	    while(!s.isEmpty()){
	        next[s.pop()]=n;
	    }
	}
	public static void prevEle(int[] prev,int[] a){
	    Stack<Integer> s = new Stack<Integer>();
	    int n= a.length;
	    for(int i=n-1;i>=0;i--){
	        while(!s.isEmpty()&& a[s.peek()]>a[i]){
	            prev[s.pop()]=i;
	        }
	        s.push(i);
	    }
	    while(!s.isEmpty()){
	        prev[s.pop()]=-1;
	    }
	}
}
