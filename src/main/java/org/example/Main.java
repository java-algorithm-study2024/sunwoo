package org.example;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
<<<<<<< HEAD

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = Integer.parseInt(s);
        int count = a / 5;
        int coin = 0;
        boolean abc = true;
        while(count >= 0){
            int check = count * 5;
            if((a - check)%2 == 0){
                coin = count + (a-check)/2;
                abc=false;
                break;
            }
            count -= 1;
        }
        if(abc){
            System.out.println("-1");
        }else{

            System.out.println(coin);
        }
=======
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

>>>>>>> 0dd0fb935fb871883fbbd88059cbfda79ae65556
    }

}