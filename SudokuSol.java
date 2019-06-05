/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		//BufferedReader br =  new BufferedReader(new InputStreamReader (System.in));
		//int testCases = Integer.parseInt(br.readLine());
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		while(testCases-->0){
		    //String [] inputStr = new String [9];
		    int [][]sudo  = new int[9][9];
		    //String t ="";
		    for(int i=0;i<9;i++){
		        //t = br.readLine();
		        //String [] temp   = t.split(" ");
		        for(int j=0;j<9;j++){
		            sudo[i][j] = s.nextInt();
		            //Integer.parseInt(temp[j]);
		        }
		    }
		    boolean res = solve(sudo);
		    if(res){
		           for(int i=0;i<9;i++)
		           {
	                    for(int j=0;j<9;j++)
	                    {
	                        System.out.print(sudo[i][j]+" ");
	                    }
	                   // System.out.println();
	             }
		    }
		    System.out.println();
		}
	}
	static boolean solve(int [][] sudo){
	   int row =-1;
	   int col =1;
	   boolean isEmpty = false;
	    for(int i=0;i<9;i++){
	        for(int j=0;j<9;j++){
	            if(sudo[i][j]==0){
	              row= i;
	              col =j;
	              isEmpty= true;
	              break;
	            }
	        }
	    }
	    if(isEmpty==false){
	        return true;
	    }
	    for(int i=1;i<=9;i++){
	        if(isSafe(row,col,i,sudo)){
	            sudo[row][col]=i;
	            if(solve(sudo)==true)
	                return true;
	            else sudo[row][col]=0;
	        }
	    }
	    return false;
	}
	static boolean isSafe(int row,int col,int num,int [][]sudo){
	    //Checking Horizontal
	    for(int s=0;s<9;s++){
	        if(sudo[row][s]==num)
	            return false;
	    }
	    //Checking Vertical
	    for(int s=0;s<9;s++){
	        if(sudo[s][col]==num)
	            return false;
	    }
	    int hor = col/3;
	    int ver = row/3;
	    
	    //Checking Inside the inner block
	    for(int t=0+ver*3;t<(3+3*ver);t++){
	        for(int s=0+hor*3;s<(3+3*hor);s++){
	            if(sudo[t][s]==num)
	                return false;
	        }
	    }
	    return true;
	}
}
