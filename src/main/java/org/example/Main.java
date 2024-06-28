package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer> [] listArray;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String node = br.readLine();
        String edge = br.readLine();
        int nodeCount = Integer.parseInt(node)+1;
        int edgeCount = Integer.parseInt(edge);
        String str;
        String [] st;
        int a,b;
        visit = new boolean[nodeCount + 1];
        listArray = new ArrayList[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            listArray[i] = new ArrayList<>();
        }
        for (int i = 0; i < edgeCount; i++) {
            str = br.readLine();
            st = str.split(" ");
            a = Integer.parseInt(st[0]);
            b = Integer.parseInt(st[1]);
            listArray[a].add(b);
            listArray[b].add(a);

        }
        visit[1] = true;
        int count =0;
        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        while (!stk.isEmpty()) {
            int top = stk.pop();
            for(int i : listArray[top]){
                if (!visit[i]){
                    visit[i] = true;
                    stk.add(i);
                    count +=1;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}