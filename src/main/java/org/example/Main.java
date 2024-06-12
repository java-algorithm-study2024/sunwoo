package org.example;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Solution{
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Queue<Integer> a = new LinkedList<>();
            for(int i : prices){
                a.add(i);
            }
            int check  = 0;
            while(!a.isEmpty()){
                int num = a.poll();
                if (a.isEmpty()){
                    answer[check] = 0;
                    break;
                }
                int count = 0;
                for(int i : a){
                    count += 1;
                    if(i < num){
                        answer[check] = count;
                        break;
                    }
                }
                answer[check] = count;
                check += 1;
            }
            return answer;
        }
    }
    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        int[] arr = {1,2,3,2,3};
        s.solution(arr);

    }
}