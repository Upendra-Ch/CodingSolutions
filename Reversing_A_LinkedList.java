class GfG
{
    public static Node reverse(Node node, int k)
    {
        Node head = node, dummy = node;
        //Your code here
        Stack<Integer> s = new Stack<Integer>();
        Node Previous = null;
        Node current  = head;
        Node next = null;
        Node prsentHead =null,prvtail=null;
        Node newHead = null;
        int count =20;
        while(current!=null){
            prsentHead =current;
            for(int i=0;i<k&& current!=null;i++)
            {
                //System.out.println("current = "+current.data);
                next = current.next;
                current.next = Previous;
                Previous = current;
                current=next;
                //head=head.next;
            }
            if(prvtail==null)
                node = Previous;
            if(prvtail!=null)
                prvtail.next = Previous;
            Previous = null;
            prvtail = prsentHead;
            /*Node tpt = null;
            //if(prvtail==null)
                tpt =node;
            while(tpt!=null){
                System.out.println("current tpt = "+tpt.data);
                tpt = tpt.next;
                
            }*/
        }
        prvtail.next =null;
        return node;
    }
}
