/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		while(numTestCases-->0){
		    //System.out.println();
		    int flag=0;
		    int n = Integer.parseInt(br.readLine());
		    if(n==1)
		        {br.readLine();
		            System.out.println("1");
		            continue;
		        }
		    else{
		        String []inputStrArr = br.readLine().split(" ");
		        int[] inputArr = new int[n];
		        int sum=0;
		        for(int i=0;i<n;i++){
		            int t = Integer.parseInt(inputStrArr[i]);
		            inputArr[i]=t;
		            sum = sum+t;
		        }
		        int cSum=0;
		        for(int i=0;i<n-1;i++){
		            cSum=cSum+inputArr[i];
		            //System.out.print("csum="+cSum+" index="+i+"\t");
		            if(cSum*2+inputArr[i+1]==(sum)){
		                flag=1;
		                System.out.println(i+2);
		                break;
		            }
		            else if(cSum*2>sum){
		               flag = 0;
		                break;
		            }
		        }
		    }
		    if(flag==0)
		    System.out.println("-1");
		}
	}
}
