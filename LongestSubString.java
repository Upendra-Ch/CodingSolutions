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
		    //int n =  Integer.parseInt(br.readLine());
		    String s = br.readLine();
		    char [] a = s.toCharArray();
		    int n = a.length;
		    boolean [][]dp = new boolean[n+1][n+1];
		    int sum=0;
		    int ri=0,rj=0;
		    
		    for(int gap =0;gap<n;gap++){
		        for(int i=0,j=i+gap;j<n;j++,i++){
		            if(i==j){
		                dp[i][j]=true;
		                sum=1;
		                ri=0;
		            }else if(gap==1){
	                    if(a[i]==a[j] && sum==2){
	                        dp[i][j]=true;
	                        sum=2;
	                    }else if(a[i]==a[j]){
	                         dp[i][j]=true;
	                        sum=2;
	                        ri=i;
	                    }
		            }else {
		                if(a[i]==a[j] && dp[i+1][j-1] ){
		                    dp[i][j]=true;
		                    if(sum<=gap){
		                        sum= gap+1;
                                ri=i;		                        
		                    }
		                    
		                }
		            }
		        }
		    }
		    StringBuilder sb = new StringBuilder("");
		    /*for(boolean r[]:dp)
		        System.out.println(Arrays.toString(r));*/
		    
            System.out.println(s.substring(ri,ri+sum));
		}
	}
}
