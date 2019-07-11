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
		    StringBuilder sb = new StringBuilder("");
		    String str = br.readLine();
		    Stack<Character> symSt = new Stack<>();
		    int n = str.length();
		    for(int i=0;i<n;i++){
		        
		        char s = str.charAt(i);
		        if(s>='0' && s<= '9' || s >='a' && s <='z' || s =='['){
		            symSt.push(s);
		            //System.out.println(symSt);
		        }
		            
		        else 
		        {
		            
		            if(s==']' && !symSt.isEmpty()){
		            char r = symSt.pop();
		            
		            String temp ="";
		            while( r !='['){
		                //System.out.println(symSt);
		                if( r >='a' && r <='z'){
		                    temp= r+temp;
		                }
		                r=symSt.pop();
		            }
		            r=symSt.pop();
		            int num=0;
		            String cal = "";
		            while(r>='0' && r<= '9' ){
		                //num= num*10+(int)r-'0';
		                cal =r+cal;
		                if(!symSt.isEmpty())
		                    r=symSt.pop(); 
		                else break;
		            }
		            
		            if(!(r>='0' && r<= '9'))
		                symSt.push(r);
		            //System.out.println(cal+" num");
		            num = Integer.parseInt(cal);
		            //StringBuilder inP = new StringBuilder("");
		            for(int j=0;j<num;j++)
		                for(int k=0;k<temp.length();k++)
		                    symSt.push(temp.charAt(k));
		                
		            }
		        }
		    }
		    while(!symSt.isEmpty())
		        sb.insert(0,symSt.pop());
		    System.out.println(sb);
		}
	}
}
