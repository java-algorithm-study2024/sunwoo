package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static String [] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int sb = Integer.parseInt(stringTokenizer.nextToken());
        int target = Integer.parseInt(stringTokenizer.nextToken());
        visit = new String[target + 1];
        Queue<Integer> que = new ArrayDeque<>();
        que.add(sb);
        for (int i = 0; i < target+1; i++) {
            visit[i] = "";
        }
        visit[sb] = "a";
        while (visit[target] == "") {
            int temp = que.poll();
            int plus = temp +1;
            int minus = temp -1;
            int mul = temp * 2;
            if (plus<=target && visit[plus] == "") {
                String str_temp = visit[temp] + '+';
                visit[plus] = str_temp;
                que.add(plus);
            }
            if (minus >= 0 && visit[minus] == "") {
                String str_temp = visit[minus] + '-';
                visit[minus] = str_temp;
                que.add(minus);
            }
            if (mul<=target && visit[mul] == "") {
                String str_temp = visit[temp] + '*';
                visit[mul] = str_temp;
                que.add(mul);
            }
        }
        System.out.println(visit[target].length()-1);
        if(visit[target] == "a") ;
        else{
        for (int i = 0; i < visit[target].length(); i++) {
            char temp = visit[target].charAt(i);
            if (temp == '+') {
                sb +=1;
                System.out.print(" " +sb);
            }else if(temp=='-'){
                sb -=1;
                System.out.print(" " + sb);
            }else if(temp=='*'){
                sb *= 2;
                System.out.print(" " + sb);
            }
        }}
        br.close();
    }
}