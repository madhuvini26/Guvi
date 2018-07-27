/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Hariharan
 */
public class CheckPost {
    
    static List<List<Integer>> graph;
    static List<List<Integer>> reverseGraph;
    static List<Pair<Integer,Integer>> pi;
    static int[] cost;
    static int[] visited;
    static int[] time;
    static long minimum=Long.MAX_VALUE;
    static int time1=1;
    static int ways=0;
    static int minCost=0;
    static int methods=1;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Input : ");
        int n=sc.nextInt();
        
        
        graph = new ArrayList<>();        
        reverseGraph = new ArrayList<>();        
        pi = new ArrayList<>();
        time=new int[n];
        cost=new int[n];
        visited=new int[n];
        
        int i,x,y;
        
        for(i=0;i<n;i++)
        {
            cost[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        
        for(i=0;i<m;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            
            List<Integer> l;
            try
            {
                l=(ArrayList<Integer>)graph.get(x-1);
                l.add(y-1);
                graph.set(x-1, l);
            }
            catch(IndexOutOfBoundsException e)
            {
                l=new ArrayList<>();
                l.add(y-1);
                while(graph.size()<x-1)
                    graph.add(new ArrayList<>());
                graph.add(x-1, l);
            }
            
            try
            {
                l=(ArrayList<Integer>)reverseGraph.get(y-1);
                l.add(x-1);
                reverseGraph.set(y-1, l);
            }
            catch(IndexOutOfBoundsException e)
            {
                l=new ArrayList<>();
                l.add(x-1);
                while(reverseGraph.size()<y-1)
                    reverseGraph.add(new ArrayList<>());
                reverseGraph.add(y-1, l);
            }
        }
        
        /*System.out.println("Graph");
        for(int a=0;a<graph.size();a++)
        {
            for(int b=0;b<graph.get(a).size();b++)
            {
                System.out.print(graph.get(a).get(b) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Reverse Graph");
        for(int a=0;a<reverseGraph.size();a++)
        {
            for(int b=0;b<reverseGraph.get(a).size();b++)
            {
                System.out.print(reverseGraph.get(a).get(b) + " ");
            }
            System.out.println();
        }*/
        
        for(i=0;i<n;i++)
        {
            DFS(i);
        }
        
        for(i=0;i<n;i++)
        {
            Pair<Integer,Integer> pair=new Pair<>(time[i],i);
            pi.add(i, pair);
            visited[i]=0;
        }
        
        /*for(i=0;i<pi.size();i++)
        {
            System.out.println("Key " + pi.get(i).getKey() + " Value " + pi.get(i).getValue());
        }*/
        
        Collections.sort(pi, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(final Pair<Integer, Integer> o1, final Pair<Integer, Integer> o2) {
                if (o1.getKey() > o2.getKey()) {
                    return -1;
                } 
                else if (o1.getKey().equals(o2.getKey())) {
                    return 0; 
                } 
                else {
                    return 1;
            }
            }
        });
        
        for(i=0;i<n;i++)
        {
            minimum=Long.MAX_VALUE;
            //System.out.println(pi.get(i).getValue());
            RDFS(pi.get(i).getValue());
            if(minimum!=Long.MAX_VALUE)
            {
                minCost+=minimum;
                methods=(methods*(ways+1));
                ways=0;
            }
        }
        System.out.println("Output :\n" + minCost + " " + methods);
    }
    
    private static void  DFS(int k)
    {
        int length=graph.get(k).size();
        int i;
        if(visited[k]==0)
        {
            visited[k]=time1;
            time1++;
            
            for(i=0;i<length;i++)
            {
                if(visited[graph.get(k).get(i)]==0)
                {
                    DFS(graph.get(k).get(i));
                }
            }
            time[k]=time1;
            time1++;
        }
    }
    private static void RDFS(int k)
    {
        int length=reverseGraph.get(k).size();
        int i;
        
        if(visited[k]==0)
        {
            visited[k]=1;
            
            for(i=0;i<length;i++)
            {
                if(visited[reverseGraph.get(k).get(i)]==0)
                {
                    RDFS(reverseGraph.get(k).get(i));
                }
            }
            if(cost[k]<minimum)
            {
                minimum=cost[k];
                ways=0;
            }
            else if(cost[k]==minimum)
            {
                ways++;
            }
        }
    }
}
