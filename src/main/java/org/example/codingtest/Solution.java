package org.example.codingtest;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int len = num_list.length;
        answer = new int[len+1];
        int ans = 0;
        if (num_list[len-1] > num_list[len-2]){
            ans = num_list[len-1] - num_list[len-2];
        }else{
            ans = num_list[len-1] * 2;
        }
        answer = num_list;
        answer[len] = ans;
        return answer;
    }
}