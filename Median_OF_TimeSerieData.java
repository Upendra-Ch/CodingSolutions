/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(br.readLine());
	    PriorityQueue<Integer> minQueue = new PriorityQueue<>();
	    PriorityQueue<Integer> maxQueue = new PriorityQueue<>((x,y) -> y-x);
	    int median = Integer.parseInt(br.readLine());
	    
	    minQueue.add(median);
	    System.out.println(minQueue.peek());
	    if(num>=2)
        {
            int temp  =  (Integer.parseInt(br.readLine()));
            if(temp <= minQueue.peek())
                maxQueue.add(temp);
            else{
                maxQueue.add(minQueue.poll());
                minQueue.add(temp);
            }
            System.out.println((minQueue.peek()+maxQueue.peek())/2);
        }
        else return;
	    
	    for(int i=2;i<num;i++){
	        int temp = (Integer.parseInt(br.readLine().trim()));
	        if(temp>=minQueue.peek())
	        {
	            if(minQueue.size()<=maxQueue.size())
	                minQueue.add(temp);
	            else {
	                    maxQueue.add(minQueue.poll());
	                    minQueue.add(temp);
	                 }
	        }
	        if(temp<minQueue.peek() && temp >=maxQueue.peek() ){
	            
	            if(minQueue.size()<=maxQueue.size()){
	                minQueue.add(temp);
	            }
	            else maxQueue.add(temp);
	        }
	        else{
	            if(temp<maxQueue.peek()){
	                if(minQueue.size()<=maxQueue.size()){
	                    minQueue.add(maxQueue.poll());
	                    maxQueue.add(temp);
	                }
	                else {
	                    maxQueue.add(temp);
	                }
	            }
	        }
	        if(i%2==0){
	            System.out.println(minQueue.peek());
	        }
	        else {
	            System.out.println((minQueue.peek()+maxQueue.peek())/2);
	        }
	    }
	}
}
