package org.example.codingtest;

import java.util.*;

public class Solution {
    Stack<Integer> after_bridge = new Stack<>();
    Deque<HashMap<Integer,Integer>> on_bridge = new ArrayDeque<>();
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int [] bridge = new int[bridge_length];
        int a = truck_weights.length;
        int i =0;
        while(after_bridge.size() !=a ){
            HashMap<Integer,Integer> truck = new HashMap<>(truck_weights[i],answer+bridge_length);
            if(truck);

        }
        return answer;
    }
}
