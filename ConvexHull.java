
import java.util.*;
import java.lang.*;
import java.io.*;
class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(Pair p){
        return p.x+" "+p.y;
    }
    public int compareTo(Pair p){
            
            if(x<p.x) return -1;
            if(x>p.x) return 1;
            return y-p.y;
            
        }
}
class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();// Integer.parseInt(br.readLine());
		while(testCases-->0){
		    int n =  sc.nextInt();//Integer.parseInt(br.readLine());
		    //String [] inpStrArr = br.readLine().split(" ");
		    if(n<3)
		    {
		        for(int i=0;i<n;i++){
    		        int x= sc.nextInt();//Integer.parseInt(inpStrArr[i]);
    		        int y= sc.nextInt();//Integer.parseInt(inpStrArr[i+1]);
    		        //list[++count] = new Pair(x,y);
    		    }
		        System.out.println("-1");
    		}
    		else
    		{
    		    int [] a = new int[n];
    		    int count =-1;
    		    Pair [] list =  new Pair[n];
    		    for(int i=0;i<n;i++){
    		        int x= sc.nextInt();//Integer.parseInt(inpStrArr[i]);
    		        int y= sc.nextInt();//Integer.parseInt(inpStrArr[i+1]);
    		        list[++count] = new Pair(x,y);
    		    }
    		    int min=0;
    		    for(int i=1;i<n;i++)
    		        if(list[i]!=null && list[min]!=null &&list[i].x<list[min].x)
    		            min =i;
    		    int org_min = min;
    		    StringBuilder sb = new StringBuilder("");
    		    /*PriorityQueue<Pair> res = new PriorityQueue<Pair>(new Comparator<Pair>(){
    		        public int compare(Pair a,Pair b){
    		            if(a.x==b.x)
    		                return (a.y-b.y) ;
    		            else return (a.x-b.x);
    		            
    		        }
    		    });*/
    		    TreeSet<Pair> res = new TreeSet<>();
    		    do{
    		        res.add(list[min]);
    		        //sb.append(list[min].x+" "+list[min].y+", ");
    		        int q= (min+1)%n;
    		        for(int i=0;i<n;i++)
    		            if(list[min]!=null && list[i]!=null && list[q]!=null && Orientation( list[min],list[i],list[q])==2)
    		                q = i;
    		        min= q;
    		            
    		    }while(list[min]!=null && org_min != min );
    		    int size =res.size();
    		    if(size<3)
    		        {
    		            System.out.println("-1");
    		            continue;
    		        }
    		    /*while(size-->0){
    		        Pair temp =res.remove();
    		        if(size!=0)
    		            sb.append(temp.x+" "+temp.y+", ");
    		        else sb.append(temp.x+" "+temp.y+" ");
    		    }*/
    		    for(Pair p:res){
    		        sb.append(p.x+" "+p.y+", ");
    		    }
    		    String tempRes = sb.toString().trim();
    		    System.out.println(tempRes.substring(0,tempRes.length()-1));
    		    }
		    }
	}
	public static int Orientation(Pair x,Pair i,Pair q){
	    int val = (i.y - x.y)*(q.x-i.x) -
	              (i.x - x.x)*(q.y-i.y);
	              
	    //System.out.println(x.x+" "+x.y+"\t"+i.x+" "+i.y+"\t"+q.x+" "+q.y+"\t"+"\tvalue= "+val);
	    if(val ==0)
	    return 0;
	    return (val>0) ? 1:2;
	}
}
