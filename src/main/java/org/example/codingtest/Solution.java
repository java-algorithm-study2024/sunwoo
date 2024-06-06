package org.example.codingtest;

import java.util.*;

class Solution {

    Deque<Integer> deq = new ArrayDeque<>();
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> ans = new ArrayList<>();
        Days(progresses,speeds);
        System.out.println(deq);
        while(!deq.isEmpty()){
            int count = 1;
            int top = deq.pop();
            for(int i : deq){
                if (i<=top){
                    deq.pop();
                    count += 1;
                }
            }
            System.out.println(count);
            ans.add(count);
        }
        Integer[] tempArray = ans.toArray(new Integer[0]);

        // Integer 배열을 int 배열로 변환합니다.
        int[] answer = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            answer[i] = tempArray[i];
        }
        return answer;
    }
    public void Days(int[] Progress,int[] speeds){
        for(int i =0;i<Progress.length;i++){
            int count = 0;
            int sum = Progress[i];
            while(sum < 100){
                count += 1;
                sum += speeds[i];
            }
            deq.add(count);
        }
    }
}