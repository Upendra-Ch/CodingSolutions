/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static Set<String> dict ;
	public static void main (String[] args)throws IOException {
        BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases-->0){
            dict =  new TreeSet<String>(); 
            int numStr = Integer.parseInt(br.readLine());
            String [] words = br.readLine().split(" ");
            TrieNode root = new TrieNode();
            for(String word :words)
                construct(word,root);
            String [] mn =  br.readLine().split(" ");
            int m= Integer.parseInt(mn[0]);
            int n= Integer.parseInt(mn[1]);
            char [][] graph =  new char[m][n];
            String [] graphStr = br.readLine().split(" ");
            int count =0;
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++){
                 char c= graphStr[count++].charAt(0);
                    graph[i][j] = c;
                }
            boolean [][] vis = new boolean [m][n];
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    search(graph,i,j,vis,"",root);
            if(dict.size()==0)
                System.out.print("-1");
                else
            for(String s : dict)
                System.out.print(s+" ");
            System.out.println();
        }
	}
	private static void search(char [][] graph,int i,int j,boolean [][] vis,String prefix,TrieNode root )
    {
        if(!isSafe(i,j,vis,graph))
            return;
        root = root.children.get(graph[i][j]);
        if(root!= null){
            prefix = prefix +graph[i][j];
            if(root.isEndofWord == true)
               dict.add(prefix) ;
            vis[i][j]= true;
            search(graph,i+1,j+1,vis,prefix,root);
            search(graph,i+1,j,vis,prefix,root);
            search(graph,i+1,j-1,vis,prefix,root);
            search(graph,i-1,j-1,vis,prefix,root);
            search(graph,i-1,j,vis,prefix,root);
            search(graph,i-1,j+1,vis,prefix,root);
            search(graph,i,j-1,vis,prefix,root);
            search(graph,i,j+1,vis,prefix,root);
            vis[i][j]= false;
        }
    }
    
    public static boolean isSafe(int i,int j, boolean [][] vis ,char [][] graph ){
        if(i>=0 && j>=0 &&i < graph.length && j<graph[0].length && vis [i][j] == false){
            return true;
        }
        return false;
    }
    
    public static void construct(String s,TrieNode root){
        if(s==null ||s.length()==0)
            return;
        for(Character c : s.toCharArray()){
            TrieNode node = root.children.get(c);
            if(node==null){
                node = new TrieNode();
                root.children.put(c,node);
            }
            root = node;
        }
        root.isEndofWord = true;
    }



    static class TrieNode{
        boolean isEndofWord = false;
        HashMap<Character, TrieNode> children ;
        TrieNode(){
            children = new LinkedHashMap<>();
        }
        
    }
}
