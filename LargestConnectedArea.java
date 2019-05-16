import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
		    String [] mn = br.readLine().split(" ");
		    int m = Integer.parseInt(mn[0]);
		    int n = Integer.parseInt(mn[1]);
		    String [] inpS = br.readLine().split(" ");
		    int count=0;
		    int [][] inp = new int[m][n];
		    for(int i=0;i<m;i++)
		        for(int j=0;j<n;j++)
		            inp[i][j] = Integer.parseInt(inpS[count++]);
		    System.out.println(find(inp,m,n));
		}
	}
	
	public static int find(int [][] inp,int m , int n){
	    int [][]vis = new int[m][n];
	    int max=0;
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
                if(vis[i][j]==0 && inp[i][j]==1){
                    int temp = dfs(inp,m,n,i,j,vis);
                    if(temp>max)
                        max= temp;
                }
	        }
	    }
	    return max;
	}
	
	static int dfs(int [][] inp,int m , int n,int s,int t, int [][]vis){
        Stack<Node> stack = new Stack<>();
        int [] nei = {0,1,-1};
        
        stack.push(new Node(s,t));
        int count=0;
        vis[s][t] =1;
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            s= temp.m;
            t= temp.n;
            count++;
            
            //System.out.println(" for every point s="+s+"\t t="+t);
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    //System.out.println("s+i="+(s+nei[i])+"\t\t\t t+t="+(j+nei[j]));
                    boolean tempBool = isSafe(inp,m,n,s+nei[i],t+nei[j],vis);
                    if(tempBool){
                        //System.out.println("s+i="+(s+nei[i])+"\tj+t="+(t+nei[j]));
                        stack.push(new Node (s+nei[i],t+nei[j]));
                        vis[s+nei[i]][t+nei[j]] =1;
                    
                    }
                }
            }    
        }//System.out.println();
        return count;
	}
	static class Node{
	    public int m,n;
	    public Node(int m,int n){
	        this.m = m;
	        this.n = n;
	    }
	}
	static boolean isSafe(int [][] inp,int m , int n,int s,int t, int [][]vis){
	    if(s>=0 && s<m && t>=0 && t<n && vis[s][t]==0 && inp[s][t]==1 ){
	        //System.out.println("s, t="+s+"\t"+t);
	        return true;
	    }
	    //System.out.println("s, t="+s+"\t"+t);
	    return false;
	}
}
