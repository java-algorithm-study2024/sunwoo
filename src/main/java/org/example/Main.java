package org.example;

import java.io.*;
import java.util.*;

import java.util.*;

public class Main {
    public static void dfs(Map<String, List<String>> graph, String node, Set<String> visited, List<String> result) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node);
        result.add(node);
        List<String> neighbors = graph.get(node);
        if (neighbors != null) {
            for (String neighbor : neighbors) {
                dfs(graph, neighbor, visited, result);
            }
        }
    }

    public static List<String> dfs(Map<String, List<String>> graph, String start) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        dfs(graph, start, visited, result);
        return result;
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Collections.emptyList());
        graph.put("F", Collections.emptyList());

        List<String> dfsResult = dfs(graph, "A");
        System.out.println("DFS 탐색 순서: " + dfsResult);
    }
}