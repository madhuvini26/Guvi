package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class ShortestPath {
    
    static int n;
    static int m;
    static int[][] graph;
    static boolean[] visited;
    static boolean destinationReached;
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        n=sc.nextInt();
        m=sc.nextInt();
        
        graph=new int[n][n];
        visited=new boolean[n];
        
        int i,u,v,w;
        
        for(i=0;i<n;i++)
            Arrays.fill(graph[i],-1);
        
        for(i=0;i<m;i++)
        {
            u=sc.nextInt();
            v=sc.nextInt();
            w=sc.nextInt();
            graph[u-1][v-1]=w;
            graph[v-1][u-1]=w;
        }
        int cost=shortestPathCost(graph,0,n-1);
        System.out.println("Output :\n" + (destinationReached?cost:"-1"));
    }
    
    private static int shortestPathCost(int[][] graph,int source,int destination)
    {
        if(source==destination || visited[source])
        {
            if(source==destination)
                destinationReached=true;
            return 0;
        }  
        int minCost=Integer.MAX_VALUE;
        int cost;
        visited[source]=true;
        for(int i=0;i<graph[0].length;i++)
        {
            if(i!=source && !visited[i] && graph[source][i]!=-1)
            {               
                cost=graph[source][i] + shortestPathCost(graph,i,destination);
                if(cost<minCost && destinationReached)
                    minCost=cost;
                if(source==0)
                {
                    Arrays.fill(visited, false);
                    visited[source]=true;
                }
            }
        }
        if(minCost==Integer.MAX_VALUE)
            minCost=0;
        return minCost;
    }
}
