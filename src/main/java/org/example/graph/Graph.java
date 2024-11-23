package org.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private HashMap<String, ArrayList<String>> adjlist = new HashMap<>();
     public Map<String, ArrayList<String>> getAdjlist() {
         return adjlist;
     }
     public boolean addVertex(String   vertex) {
         if(adjlist.get(vertex) == null){
             adjlist.put(vertex, new ArrayList<>());
             return true;
         }
         return false;
     }
     public boolean addEdge(String vertex1, String vertex2){
         if(adjlist.get(vertex1)!= null && adjlist.get(vertex2)!=null){
             adjlist.get(vertex1).add(vertex2);
             adjlist.get(vertex2).add(vertex1);
             return false;
         }
         return false;
     }
     public boolean removeEdge(String vertex1, String vertex2){
         if(adjlist.get(vertex1)!= null && adjlist.get(vertex2)!=null){
             adjlist.get(vertex1).remove(vertex2);
             adjlist.get(vertex2).remove(vertex1);
             return true;
         }
         return false;
     }
     public boolean removeVertex(String vertex){
         if(adjlist.get(vertex)!= null){
             for(String edge:adjlist.get(vertex)){
                 adjlist.get(edge).remove(vertex);
             }
             adjlist.remove(vertex);
         }
         return false;
     }
}
