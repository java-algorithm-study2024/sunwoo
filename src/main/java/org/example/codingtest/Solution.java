package org.example.codingtest;

import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
        Set<Integer> temp;
        int[] answer = new int[info.length];
        for (String str : info) {
            int sum = view(str);
            int count = sum % 1000;
            sum = sum /1000;
            if(hash.containsKey(sum)){
                hash.get(sum).add(count);
            }else{
                hash.put(sum, new ArrayList<>());
                hash.get(sum).add(count);
            }
        }
        System.out.println(hash);
        int i =0;

        return answer;
    }


    private int view(String str) {
        int sum = 0;
        String [] temp = str.split(" ");
        System.out.println(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3]);
        if(Objects.equals(temp[0], "java")) {
            sum += 1000000;
        }else if(Objects.equals(temp[0], "python")){
            sum += 2000000;
        }else{
            sum += 3000000;
        }
        if(Objects.equals(temp[1], "backend")){
            sum += 100000;
        }else{
            sum +=200000;
        }
        if(Objects.equals(temp[2], "junior")){
            sum += 10000;
        }else{
            sum +=20000;
        }
        if(Objects.equals(temp[3], "pizza")){
            sum += 1000;
        }else{
            sum += 2000;
        }
        sum += Integer.parseInt(temp[4]);
        return sum;
    }
}