
class GfG
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    /* The method insert to push element into the queue */
    void insert(int B)
    {
	// Your code here
	    s1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
	// Your code here
	    if(!s2.empty()){
	        return s2.pop();
	    }
	    else{
	        if(s1.empty())
	            return -1;
	        while(!s1.empty())
	        {
	            s2.push(s1.pop());
	        }
	        return s2.pop();
	    }
    }
}
