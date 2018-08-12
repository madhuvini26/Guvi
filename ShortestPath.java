/*
Given 2 integers N,M(where N is the number of vertices and M is the number of edges) followed by 'M' lines containing 2 vertices 
U,V and weight W. Find the shortest path from 1-N.If there is no path print '-1'.
Input Size : 1<=N, M<=100000
Example:
INPUT
5 6
1 2 2
2 5 5
2 3 4
1 4 1
4 3 3
3 5 1
OUTPUT
5
*/
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
    static boolean destinationReachedInCurrentPath;
    
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
            {
                destinationReached=true;
                destinationReachedInCurrentPath=true;
            }
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
                if(cost<minCost && destinationReachedInCurrentPath)
                    minCost=cost;
                if(source==0)
                {
                    Arrays.fill(visited, false);
                    visited[source]=true;
                    destinationReachedInCurrentPath=false;
                }
            }
        }
        if(minCost==Integer.MAX_VALUE)
            minCost=0;
        return minCost;
    }
}
