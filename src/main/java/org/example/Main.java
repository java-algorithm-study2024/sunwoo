package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int D = Integer.parseInt(temp[1]);
        int K = Integer.parseInt(temp[2]);
        int C = Integer.parseInt(temp[3]);
        int[] sushi = new int[N];
        int[] list = new int[N + K - 1];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < K - 1; i++) {
            list[N++] = list[i];
        }
        int[] eaten = new int[D + 1];
        eaten[C] +=1;
        int max =1;
        int start = 0;
        for (int i = start; i < K; i++) {
            if(eaten[list[i]] == 0){
                max ++;
            }
            eaten[list[i]] +=1;
        }
        start = 0;
        int end = K;
        int result= max;
        for(int i = end;)
    }
}
