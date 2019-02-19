/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; 
class GFG {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		    int fib = Integer.parseInt(br.readLine());
		    if(fib==1){
		        System.out.println("1");
		        continue;
		    }
		    long [] fibArr =  new long[fib];
		    fibArr[0]=1;
		    fibArr[1]=1;
		    long sum =0;
		   // BigInteger sum = new BigInteger("0");
		    StringBuilder bl = new StringBuilder("1 1");
		    for(int i=2;i<fib;i++){
		        fibArr[i]=fibArr[i-2]+fibArr[i-1];
		        if(fibArr[i]%2==0 && fibArr[i] <= fib )
		            sum=sum+fibArr[i];
		        if (fibArr[i] > fib)
		                break;
		    }
		      System.out.println(sum);
		}
	}
}
