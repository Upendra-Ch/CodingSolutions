class GfG
{
    void compute(LinkedList l)
    {
        Node temp = l.head,prev = null;
        //int count =20;
        /*
        15
        709 206 45 415 649 120 80 47 415 606 275 500 900 11 767
        */
        Stack<Integer> s = new Stack<>();
        s.push(temp.data);
        temp=temp.next;
        while(temp!=null ){
            //while(temp.data<)
            while(s.size()!=0 && s.peek()<temp.data)
                s.pop();
            s.push(temp.data);
            temp=temp.next;
        }
        temp = l.head;
        int count =0;
        while(s.size()!=0){
            if(count ==0)
            {
                Node ne = new Node(s.pop());
                l.head= ne;
                count=count+1;
            }
           
           else{
               Node ne = new Node(s.pop());
               ne.next = l.head;
               l.head=ne;
           }
        }
    }
}
  
