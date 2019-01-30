/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int numTestCases = Integer.parseInt(br.readLine().trim());
		while(numTestCases-- >0){
		    int num = Integer.parseInt(br.readLine());
		    String[] inputStrArr = br.readLine().split(" ");
		    int [] inputArr = new int[num];
		    for (int i=0;i<num;i++)
		        inputArr[i]= Integer.parseInt(inputStrArr[i]);
		    int maxGlobal , maxCur;
		    maxGlobal = maxCur = inputArr[0];
		    for(int i = 1;i<num;i++){
		        maxCur = (maxCur> (maxCur+inputArr[i])) ? maxCur:(maxCur+inputArr[i]);
		      // System.out.println("maxCur="+maxCur+"\t(maxCur+inputArr[i])="+(maxCur+inputArr[i]));
		      /* if(maxCur<(maxCur+inputArr[i]))
		       {
		           maxCur=(maxCur+inputArr[i]);
		       }*/
		       if(maxCur>maxGlobal)
		        maxGlobal=maxCur;
		    }
		    System.out.println(maxGlobal);
		}
	}
}

